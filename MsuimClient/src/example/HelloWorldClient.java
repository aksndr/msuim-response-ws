package example;//Created by Arzamastsev on 06.04.2017.

import com.sun.jmx.remote.internal.ArrayQueue;
import com.sun.xml.internal.ws.client.BindingProviderProperties;
import ru.terralink.model.REAttrDataExchangeService;
import ru.terralink.model.REDataExchangeAttrECD;
import ru.terralink.model.REDataExchangeAttrFile;
import ru.terralink.model.REDataExchangeHeader;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.SOAPBinding;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class HelloWorldClient {

    private static final String NAME_SPACE_URL = "http://inform.gazprom.ru/C/SUIM/REDataExchange";
    private static final String WS_NAME = "REAttrDataExchangeServiceService";


    public static void main(String[] argv) throws Exception {
        List<byte[]> chunks = getChunks();

        REAttrDataExchangeService service = getService("http://localhost:8080/msuim-ws/service/REAttrDataExchangeService?wsdl", "otadmin@otds.admin", "Qwerty!234", chunks);



        REDataExchangeAttrECD message = getTestMessage(chunks);

        service.reAttrDataExchangeOut(message);
    }


    private static REAttrDataExchangeService getService(String url, String login, String pass, List<byte[]> chunks) throws IOException {
        URL wsdlUrl = new URL(url);
        QName qName = new QName(NAME_SPACE_URL, WS_NAME);
        Service service = Service.create(wsdlUrl, qName);
        REAttrDataExchangeService reAttrDataExchangeOut = service.getPort(REAttrDataExchangeService.class);

        BindingProvider bp = (BindingProvider) reAttrDataExchangeOut;

        Map<String, Object> requestContext = bp.getRequestContext();

        requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 5000);
        requestContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 25000);
        requestContext.put(BindingProvider.USERNAME_PROPERTY, login);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, pass);

        requestContext.put("chunks", chunks.size());

        SOAPBinding binding = (SOAPBinding) bp.getBinding();
        List<Handler> handlerChain = binding.getHandlerChain();
        SoapMessageHandler mh = new SoapMessageHandler();
        mh.setChunks(chunks);
        mh.setMimeType("application/pdf");
        mh.setContentId("Livelink_ECM_-_Enterprise_Server_Installation_Guide.pdf");
        handlerChain.add(mh);
        binding.setHandlerChain(handlerChain);

        return reAttrDataExchangeOut;
    }

    private static List<byte[]> getChunks() throws IOException {

        String pathSrc = "D:\\rnd\\docs\\ot\\Best_Practices_-_Applying_Update_2016-06_to_OpenText_Content_Server_10.pdf";
        byte[] contentSrc = Files.readAllBytes(Paths.get(pathSrc));
        List<byte[]> parts = splitContent(contentSrc);

        return parts;
    }


    private static REDataExchangeAttrECD getTestMessage(List<byte[]> chunks) throws ParseException, DatatypeConfigurationException {

        REDataExchangeAttrECD message = new REDataExchangeAttrECD();

        REDataExchangeHeader header = new REDataExchangeHeader();
        header.setLogicalSystem("QASCLNT400");
        header.setObjectType("I0");
        header.setObjectNumber("I000000000000000075912");
        header.setActivity("02");
        header.setObjectTypeDiff("ZEC1");
        header.setDestination("1025");

        message.setHeader(header);


//    REDataExchangeAttrECD.OBJECTREFS objectrefs = new REDataExchangeAttrECD.OBJECTREFS();
//    objectrefs.setOBJECTREF("IS00010000001001467");
//    objectrefs.setObjCommType("01");
//    objectrefs.setLINK("00");

        REDataExchangeAttrECD.GENERAL general = new REDataExchangeAttrECD.GENERAL();
        general.setDOCTYPE("1045");
        general.setDOCGRCODE("2BBCA");
        general.setDOCNUM("380/12345/1");
        general.setDOCDATE(stringToXMLGregorianCalendar("2016-01-01"));
        general.setDOCNAME("Тест 367 №2 (краткое наименование) 157597501");
        general.setREMARKS("Тест 367 №2  (Примечание)1575");
        general.setRERF("GTFTNI");
        general.setAUTORDOC("Титаев Никита Игоревич");

        message.setGENERAL(general);

        REDataExchangeAttrECD.CONTRACT contract = new REDataExchangeAttrECD.CONTRACT();

        contract.setBP1("87107");
        contract.setXBP1("Газпром");
        contract.setBP2("313526");
        contract.setXBP2("Факел1");
        contract.setRECNBEG(stringToXMLGregorianCalendar("2016-01-01"));
        contract.setRECNEND1ST(stringToXMLGregorianCalendar("2018-12-31"));
        contract.setRECNREGDJR(stringToXMLGregorianCalendar("2018-12-31"));
        contract.setRECNREGJR("55/1/01");
        contract.setRECNREGDCH(stringToXMLGregorianCalendar("2018-12-31"));
        contract.setRECNNRCH("111/1");
        contract.setRECNREGST("77-77-14/001/2014-156");
        contract.setRECNREGDST(stringToXMLGregorianCalendar("2018-12-31"));

        message.setCONTRACT(contract);

        int currentPart = 1;
        for (byte[] chunk : chunks) {
            String currentHash = getSha1Hash(chunk);

            String fileName = "Livelink_ECM_-_Enterprise_Server_Installation_Guide.pdf";
            String fileID = "6FD2F2354243541EE780E19EAD6AE59EDE";
            XMLGregorianCalendar datum = stringToXMLGregorianCalendar("2018-12-31");


            REDataExchangeAttrFile attrFile = buildReDataExchangeAttrFile(fileName, fileID, "1", datum, false);
            fillAttachmentData(attrFile, "", currentPart, chunks.size(), currentHash);

            message.getAttrFile().add(attrFile);

            currentPart++;
        }

        return message;
    }

    private static REDataExchangeAttrFile buildReDataExchangeAttrFile(String fileName, String fileID, String nomer, XMLGregorianCalendar datum, boolean b) {
        REDataExchangeAttrFile attrFile = new REDataExchangeAttrFile();
        attrFile.setFileID(fileID);

        attrFile.setNOMER(new BigInteger(nomer));
        attrFile.setFILENAME(fileName);

        return attrFile;
    }

    private static void fillAttachmentData(REDataExchangeAttrFile attrFile, String allHash, int currentPart, int totalParts, String currentHash) {
        attrFile.setCurrentPart(BigInteger.valueOf(currentPart));
        attrFile.setAllParts(BigInteger.valueOf(totalParts));
        attrFile.setCurrentHash(currentHash);
        attrFile.setAllHash(allHash);
    }


    public static XMLGregorianCalendar stringToXMLGregorianCalendar(String s)
            throws ParseException, DatatypeConfigurationException {

        XMLGregorianCalendar result = null;
        Date date;
        SimpleDateFormat simpleDateFormat;
        GregorianCalendar gregorianCalendar;

        simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        date = simpleDateFormat.parse(s);
        gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
        gregorianCalendar.setTime(date);
        result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        result.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        result.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);

        return result;
    }

    public static List<byte[]> splitContent(byte[] attachmentContent) {
        return splitContent(attachmentContent, 5);
    }

    public static List<byte[]> splitContent(byte[] attachmentContent, int chunkSize) {
        int len = attachmentContent.length;
        chunkSize = getInMibs(chunkSize);
        int chunksQty = len / chunkSize;

        int start = 0;
        int end = chunkSize;

        List<byte[]> chunks = new ArrayQueue<byte[]>(chunksQty + 1);
        for (int i = 0; i <= chunksQty; i++) {
            if (end >= len) end = len;
            chunks.add(Arrays.copyOfRange(attachmentContent, start, end));
            start += chunkSize;
            end += chunkSize;
        }
        return chunks;
    }

    private static int getInMibs(int i) {
        return i * 1024 * 1024;
    }

    public static String getSha1Hash(byte[] chunk) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA1");
            byte[] mdbytes = md.digest(chunk);

            StringBuilder sb = new StringBuilder();
            for (byte mdbyte : mdbytes) {
                sb.append(Integer.toString((mdbyte & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }
}
