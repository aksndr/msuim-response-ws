package ru.terralink.ws.msuim.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.terralink.ws.common.Utils;
import ru.terralink.ws.msuim.Attachment;
import ru.terralink.ws.msuim.AttachmentsInfo;

import javax.xml.namespace.QName;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.BufferedInputStream;
import java.util.Iterator;
import java.util.Set;

public class MsuimSoapHandler implements SOAPHandler<SOAPMessageContext> {

    private static final Logger logger = LoggerFactory.getLogger(MsuimSoapHandler.class.getSimpleName());

    @Autowired
    @Qualifier("attachmentsInfo")
    private AttachmentsInfo attachmentsInfo;

    public MsuimSoapHandler() {
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        logger.info("Server executing SOAP Handler");

        Boolean outBoundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (!outBoundProperty) {

            try {
                SOAPMessage soapMsg = context.getMessage();
                context.put("test","test");
                String[] mimeHeader = soapMsg.getSOAPPart().getMimeHeader("Content-type");

                for(String str : mimeHeader){
                    logger.info("Content-type = " + str);
                }

                Iterator attachments = soapMsg.getAttachments();

                int i = 1;
                while (attachments.hasNext()) {
                    logger.info("Message has attachment");
                    AttachmentPart att = (AttachmentPart) attachments.next();

                    if (att.getMimeHeader("content-id") == null)
                        continue;

                    String contentID = "";
                    for(String str : att.getMimeHeader("content-id")){
                        contentID += str;
                    }

                    if (contentID == "" || !contentID.contains("payload"))
                        continue;

                    String contentType = att.getContentType();
                    String[] parts = contentType.split(";");

                    Attachment attachment = new Attachment();

                    if (parts.length > 0) {
                        attachment.setContentType(parts[0]);
                    }
                    logger.info("MsuimSoapHandler: ContentType = " + attachment.getContentType());

                    BufferedInputStream inputStream = new BufferedInputStream(att.getDataHandler().getInputStream());
                    byte[] content = Utils.toByteArray(inputStream);
                    attachment.setContent(content);

                    logger.info("MsuimSoapHandler attachment: "+i+" content size : " + content.length);
                    attachmentsInfo.addAttachment(attachment);
                    i++;
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
        }
        logger.info("Execute SOAP Handler has done");
        return true;
    }

    private String getFileName(String headerValue){

        String[] headerItems = headerValue.split("; ");
        for (int i = 0; i<headerItems.length; i++){
            String item = headerItems[i];
            if (!item.contains("filename") || !item.contains("=")) continue;
            String name = item.replaceAll("filename=","");
            name = name.startsWith("\"") ? name.substring(1,name.length()) : name;
            name = name.endsWith("\"") ? name.substring(0,name.length()-1) : name;

            return name;
        }

        return java.util.UUID.randomUUID().toString();
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }
}