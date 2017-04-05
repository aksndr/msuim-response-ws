package ru.terralink.ws.msuim.impl;

import com.opentext.ecm.services.authws.AuthenticationService;
import com.opentext.livelink.service.core.*;
import com.opentext.livelink.service.docman.DocumentManagement;
import com.opentext.livelink.service.docman.DocumentManagement_Service;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.JAXWSProperties;
import com.sun.xml.ws.developer.WSBindingProvider;
import org.apache.commons.io.FilenameUtils;
import org.apache.tika.mime.MimeTypeException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import ru.terralink.ws.common.Utils;
import ru.terralink.ws.msuim.Attachment;
import ru.terralink.ws.msuim.AttachmentsInfo;
import ru.terralink.ws.msuim.OpenTextAdapter;
import ru.terralink.ws.msuim.REAttrDataExchange;
import ru.terralink.ws.object.request.REDataExchangeAttrECD;
import ru.terralink.ws.object.response.REAttrDataExchangeResponse;

import javax.activation.DataHandler;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.MTOMFeature;
import javax.xml.ws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import static ru.terralink.ws.msuim.constant.REAttrDataExchangeOutConstant.*;

/**
 * Created by AzarovD on 19.01.2016.
 */
@Component("reAttrDataExchangeService")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
@WebService(targetNamespace = "http://inform.gazprom.ru/C/SUIM/REDataExchange",
        endpointInterface = "ru.terralink.ws.msuim.impl.REAttrDataExchangeService")

@BindingType(SOAPBinding.SOAP11HTTP_BINDING)

public class REAttrDataExchangeService implements REAttrDataExchange {

    private static final Logger logger = LoggerFactory.getLogger(REAttrDataExchangeService.class.getSimpleName());

    @Autowired
    @Qualifier("openTextAdapter")
    public OpenTextAdapter openTextAdapter;

    @Autowired
    @Qualifier("attachmentsInfo")
    private AttachmentsInfo attachmentsInfo;

    @Override
    @WebMethod(operationName = "REAttrDataExchangeResponseMessage", action = "REAttrDataExchangeResponseMessage")
    public String reAttrDataExchangeResponseMessage(@WebParam(name = "REAttrDataExchangeResponseMessage",
            partName = "REAttrDataExchangeResponseMessage",
            targetNamespace = "http://inform.gazprom.ru/C/SUIM/REDataExchange")
                                                    REAttrDataExchangeResponse reAttrDataExchangeResponse) {
        logger.error("Run sendReAttrDataExchangeResponse ...");

        if (reAttrDataExchangeResponse == null) {
            logger.error("Argument REAttrDataExchangeResponse = null.");
        }

        JSONObject requestData = buildReAttrExchangeRequest(reAttrDataExchangeResponse);
        byte[] httPostRequest = createHttpPostRequest(requestData, MSUIMSYNC_SET_MSUIM_RESPONSE);
        String otdsToken = null;
        try {
            otdsToken = getOTDSAuthToken();
        } catch (Exception e) {
            e.printStackTrace();
        }
        post(httPostRequest, otdsToken);
        return null;
    }

    private String post(byte[] httPostRequest, String otdsToken) {
        try {
            URL url = new URL(openTextAdapter.getOpenTextUrl());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setInstanceFollowRedirects(false);
            conn.setRequestMethod(REQUEST_METHOD_POST);
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Content-Length", Integer.toString(httPostRequest.length));
            conn.setRequestProperty("Referer", openTextAdapter.getOpenTextUrl());
            if (otdsToken != null)
                conn.setRequestProperty("Cookie", "OTDSTicket=" + otdsToken + ";, LLTZCookie=0");
            conn.setUseCaches(false);

            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            wr.write(httPostRequest);
            wr.flush();
            wr.close();

            int responseCode = conn.getResponseCode();
            logger.info("POST Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                logger.info("Pass arguments: " + response.toString());
                return response.toString();
            } else {
                String location = conn.getHeaderField("Location");
                logger.error("POST request not worked. \nThe header field is " + location);
            }
        } catch (Exception e) {
            logger.error(RESULT_FAILED + "\n" + e.getMessage());
        }
        return null;
    }

    private JSONObject buildReAttrExchangeRequest(REAttrDataExchangeResponse reAttrDataExchangeResponse) {
        JSONObject response = new JSONObject();
        JSONArray jsonFilesObject = new JSONArray();

        response.put(LOGICAL_SYSTEM, reAttrDataExchangeResponse.getLogicalSystem());
        response.put(INTERNAL_OBJECT_NUMBER, reAttrDataExchangeResponse.getInternalObjectNumber());
        response.put(EXTERNAL_OBJECT_NUMBER, reAttrDataExchangeResponse.getExternalObjectNumber());
        response.put(TRAY_CODE, reAttrDataExchangeResponse.getTrayCode());
        response.put(RESULT_SUCCESS, reAttrDataExchangeResponse.getSuccess());
        response.put(DESTINATION, reAttrDataExchangeResponse.getDestination());
        response.put(PARENT_MSG_ID, reAttrDataExchangeResponse.getParentMsgID());

        if (reAttrDataExchangeResponse.getFiles() != null && !reAttrDataExchangeResponse.getFiles().getFile().isEmpty()) {
            for (REAttrDataExchangeResponse.Files.File file : reAttrDataExchangeResponse.getFiles().getFile()) {
                JSONObject jsonFileObject = new JSONObject(); //file
                jsonFileObject.put(FILE_NAME, file.getFileName());
                jsonFileObject.put(FILE_SIZE, file.getFileSize());
                jsonFileObject.put(INTERNAL_FILE_ID, file.getInternalFileID());
                jsonFileObject.put(EXTERNAL_FILE_ID, file.getExternalFileID());
                jsonFileObject.put(CURRENT_PART, file.getCurrentPart());
                jsonFileObject.put(ALL_PARTS, file.getAllParts());
                jsonFileObject.put(LOCATION_SUIM, file.getLocationSUIM());
                jsonFileObject.put(LOCATION_ELAR, file.getLocationELAR());
                REAttrDataExchangeResponse.Files.File.ErrorText errorText = file.getErrorText();
                fillFileErrorText(errorText, jsonFileObject);

                jsonFilesObject.put(jsonFileObject);
            }
        }

        response.put(FILES, jsonFilesObject);

        fillErrorText(reAttrDataExchangeResponse, response);

        return response;
    }

    private JSONObject buildReAttrExchangeRequest2(REDataExchangeAttrECD reAttrDataExchangeResponse) {
        JSONObject r = new JSONObject(reAttrDataExchangeResponse);
        return r;
    }

    private void fillErrorText(REAttrDataExchangeResponse reAttrDataExchangeResponse, JSONObject response) {
        REAttrDataExchangeResponse.ErrorText errorText = reAttrDataExchangeResponse.getErrorText();
        if (errorText != null && !errorText.getLine().isEmpty()) {
            JSONArray jsonFileLine = new JSONArray();
            for (String line : errorText.getLine()) {

                jsonFileLine.put(line);
            }
            response.put(ERROR_TEXT, jsonFileLine);
        }
    }

    private void fillFileErrorText(REAttrDataExchangeResponse.Files.File.ErrorText errorText, JSONObject jsonObject) {
        if (errorText != null && !errorText.getLine().isEmpty()) {
            JSONArray jsonFileLine = new JSONArray();
            for (String line : errorText.getLine()) {
                jsonFileLine.put(line);
            }
            jsonObject.put(ERROR_TEXT, jsonFileLine);
        }
    }

    private byte[] createHttpPostRequest(Object o, String funcName) {
        StringBuilder strPostRequest = new StringBuilder();

        if (o == null) {
            logger.error("Failed to build Http Request. The incoming params is null.");
            return null;
        }

        try {
            strPostRequest.append(URLEncoder.encode(FUNCTION_PREFIX, UTF_8))
                    .append(SEPARATOR)
                    .append(URLEncoder.encode(funcName, UTF_8))

                    .append(AND)
                    .append(URLEncoder.encode(CONTENT, UTF_8))
                    .append(SEPARATOR)
                    .append(URLEncoder.encode(o.toString(), UTF_8));
        } catch (UnsupportedEncodingException e) {
            logger.error("Failed encode params:  " + e);
        }

        logger.info("Request: \n" + strPostRequest.toString());
        return strPostRequest.toString().getBytes();
    }

    @Override
    @WebMethod(operationName = "REAttrDataExchangeOut", action = "REAttrDataExchangeMessage")
    @Oneway
    public void reAttrDataExchangeMessage(@WebParam(name = "REAttrDataExchangeMessage", partName = "REAttrDataExchangeMessage")
                                          REDataExchangeAttrECD reAttrDataExchangeMessage) {

        List<Attachment> attachments = attachmentsInfo.getAttachments();
        attachmentsInfo.setAttachments(new ArrayList<Attachment>());

        logger.info("Run sendReAttrDataExchangeMessage...");
        try {
            if (CollectionUtils.isEmpty(reAttrDataExchangeMessage.getAttrFile()))
                throw new RuntimeException("Attribute AttrFile not found!");

            String otdsToken = getOTDSAuthToken();
            logger.info("OTDS token: " + otdsToken);

            Authentication authClient = getAuthenticationClient();
            String csAuthToken = validateOTDSAuthToken(authClient, otdsToken);
//                String csAuthToken = authClient.authenticateUser("otadmin@otds.admin", "Qwerty!234");
            logger.info("Got csAuth token: " + csAuthToken);
            DocumentManagement docManClient = getDocumentManagement(csAuthToken);

            JSONObject ob = buildReAttrExchangeRequest2(reAttrDataExchangeMessage);
            JSONObject res = getDataID(ob, otdsToken);
            JSONArray values = res.getJSONArray("value");
            for (int i = 0; i < values.length(); i++) {
                JSONObject value = values.getJSONObject(i);

                logger.info("MSUIMID : " + value.get("MSUIMID"));
                if (!value.has("DataID")){
                    logger.error("OTCS Does not returned dataid for : " + value.get("MSUIMID"));
                    continue;
                }
                Integer dataID = (Integer)value.get("DataID");
                String fileName = reAttrDataExchangeMessage.getAttrFile().get(i).getFILENAME();
                logger.info("Attr file filename: " + fileName);

                XMLGregorianCalendar fileDate = reAttrDataExchangeMessage.getAttrFile().get(i).getDATUM();

                Attachment attachment = attachments.get(i);
                logger.info("attachmentsInfo contentType: " + attachment.getContentType());

                String contentType = attachment.getContentType();

                byte[] content = attachment.getContent();
                long inputStreamLength = content.length;
                logger.info("Content size : " + inputStreamLength);

                //String contextID = generateContextId(docManClient, dataID, fileName);
                String contextID = docManClient.addVersionContext(dataID, null);
                logger.info("Got contextID: " + contextID);

                FileAtts fileAtts = createFileAtts(fileName, inputStreamLength, fileDate, contentType);

                ContentService contentServiceClient = getContentServiceClient(csAuthToken, contextID, fileAtts);

                logger.info("Uploading document...");
                String objectID = contentServiceClient.uploadContent(new DataHandler(content, contentType));
                logger.info(RESULT_SUCCESS + "\nNew document uploaded with ID = " + objectID);
            }

        } catch (Exception e) {
            logger.error(RESULT_FAILED + "\n" + e.getMessage());
        }

        logger.info("Finished");
    }

    private JSONObject getDataID(Object ob, String otdsToken) throws Exception {
        byte[] httPostRequest = createHttpPostRequest(ob, MSUIMSYNC_GET_DATAID_BY_MSUIMNUM);

        String response = post(httPostRequest, otdsToken);
        JSONObject o = new JSONObject(response.toString());
        if (!o.getBoolean("ok")) {
            throw new Exception(o.getString("errMsg"));
        }
        return o;
    }

    private String getOTDSAuthToken() throws Exception {
        logger.info("running getOTDSAuthToken");
        URL authWsdl = new URL(openTextAdapter.getOtdsAuthenticationWsdlUrl());
        AuthenticationService otdsAuthService = new AuthenticationService(authWsdl);
        com.opentext.ecm.services.authws.Authentication otdsAuthClient = otdsAuthService.getAuthenticationPort();
        return otdsAuthClient.authenticate(openTextAdapter.getUser(), openTextAdapter.getPassword());
    }

    private Authentication getAuthenticationClient() throws Exception {
        logger.info("running getAuthenticationClient");

        URL authWsdl = new URL(openTextAdapter.getAuthenticationWsdlUrl());
        Authentication_Service authService = new Authentication_Service(authWsdl);
        return authService.getBasicHttpBindingAuthentication();
    }

    private String validateOTDSAuthToken(Authentication authClient, String otdsAuthToken) throws Exception {
        logger.info("Validate OTDS Authentication Token...");
        return authClient.validateUser(otdsAuthToken);
    }

    private DocumentManagement getDocumentManagement(String csAuthToken) throws Exception {
        logger.info("running getDocumentManagement");
        URL docManager = new URL(openTextAdapter.getDocManagementWsdlUrl());
        DocumentManagement_Service docManService = new DocumentManagement_Service(docManager);
        DocumentManagement docManClient = docManService.getBasicHttpBindingDocumentManagement();
        fillSoapHeader((WSBindingProvider) docManClient, csAuthToken);
        return docManClient;
    }

    private void fillSoapHeader(WSBindingProvider bindingProvider, String csAuthToken) throws Exception {
        SOAPHeader header = MessageFactory.newInstance().createMessage().getSOAPPart().getEnvelope().getHeader();
        SOAPHeaderElement otAuthElement = header.addHeaderElement(new QName(ECM_API_NAMESPACE, "OTAuthentication"));
        SOAPElement authTokenElement = otAuthElement.addChildElement(new QName(ECM_API_NAMESPACE, "AuthenticationToken"));
        authTokenElement.addTextNode(csAuthToken);
        bindingProvider.setOutboundHeaders(Headers.create(otAuthElement));
    }

    private void fillSoapHeader(String csAuthToken, String contextID, WSBindingProvider contentServiceClient, FileAtts fileAtts) throws Exception {
        SOAPHeader header = MessageFactory.newInstance().createMessage().getSOAPPart().getEnvelope().getHeader();
        SOAPHeaderElement otAuthElement = header.addHeaderElement(new QName(ECM_API_NAMESPACE, "OTAuthentication"));
        SOAPElement authTokenElement = otAuthElement.addChildElement(new QName(ECM_API_NAMESPACE, "AuthenticationToken"));
        authTokenElement.addTextNode(csAuthToken);
        SOAPHeaderElement contextIDElement = header.addHeaderElement(new QName(CORE_NAMESPACE, "contextID"));
        contextIDElement.addTextNode(contextID);
        SOAPHeaderElement fileAttsElement = header.addHeaderElement(new QName(CORE_NAMESPACE, "fileAtts"));
        SOAPElement createdDateElement = fileAttsElement.addChildElement(new QName(CORE_NAMESPACE, "CreatedDate"));
        createdDateElement.addTextNode(fileAtts.getCreatedDate().toString());
        SOAPElement modifiedDateElement = fileAttsElement.addChildElement(new QName(CORE_NAMESPACE, "ModifiedDate"));
        modifiedDateElement.addTextNode(fileAtts.getModifiedDate().toString());
        SOAPElement fileSizeElement = fileAttsElement.addChildElement(new QName(CORE_NAMESPACE, "FileSize"));
        fileSizeElement.addTextNode(fileAtts.getFileSize().toString());
        SOAPElement fileNameElement = fileAttsElement.addChildElement(new QName(CORE_NAMESPACE, "FileName"));
        fileNameElement.addTextNode(fileAtts.getFileName());
        List<Header> headers = new ArrayList<Header>();
        headers.add(Headers.create(otAuthElement));
        headers.add(Headers.create(contextIDElement));
        headers.add(Headers.create(fileAttsElement));
        contentServiceClient.setOutboundHeaders(headers);
    }

    private String generateContextId(DocumentManagement docManClient, Long dataId, String fileName) throws Exception {
        logger.info("Generating context ID...");
        return docManClient.createDocumentContext(dataId, fileName, null, false, null);
    }

    private ContentService getContentServiceClient(String csAuthToken, String contextID, FileAtts fileAtts) throws Exception {
        logger.info("running getContentServiceClient");
        URL contentServiceWsdlUrl = new URL(openTextAdapter.getContentserviceWsdlUrl());
        ContentService_Service contentService = new ContentService_Service(contentServiceWsdlUrl);

        ContentService contentServiceClient = contentService.getBasicHttpBindingContentService(new MTOMFeature());
        ((WSBindingProvider) contentServiceClient).getRequestContext().put(JAXWSProperties.HTTP_CLIENT_STREAMING_CHUNK_SIZE, CHUNK_SIZE);
        fillSoapHeader(csAuthToken, contextID, (WSBindingProvider) contentServiceClient, fileAtts);

        return contentServiceClient;
    }

    private FileAtts createFileAtts(String fileName, long length, XMLGregorianCalendar datum, String contentType) {
        FileAtts fileAtts = new FileAtts();
        fileAtts.setCreatedDate(datum);
        fileAtts.setFileName(getFilename(fileName, contentType));
        fileAtts.setFileSize(length);
        fileAtts.setModifiedDate(datum);
        return fileAtts;
    }

    private String getFilename(String filename, String contentType) {
        String extension = FilenameUtils.getExtension(filename);
        if (extension == null || extension == "") {
            try {
                extension = Utils.getExtensionByMimeType(contentType);
                filename += extension;
            } catch (MimeTypeException e) {
                e.printStackTrace();
            }
        }
        return filename;
    }




    public void setAttachmentsInfo(AttachmentsInfo attachmentsInfo) {
        this.attachmentsInfo = attachmentsInfo;
    }

    public AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }
}
