package ru.terralink.ws.msuim.handler;

/**
 * Created by AzarovD on 02.02.2016.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.terralink.ws.msuim.Attachment;
import ru.terralink.ws.msuim.AttachmentsInfo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

@Component
public class MsuimSoapHandler implements SOAPHandler<SOAPMessageContext> {

    private static final Logger logger = LoggerFactory.getLogger(MsuimSoapHandler.class.getSimpleName());
    @Autowired
    @Qualifier("attachmentsInfo")
    private AttachmentsInfo attachmentsInfo;

    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        logger.info("Server executing SOAP Handler");

        Boolean outBoundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (!outBoundProperty) {

            try {
                SOAPMessage soapMsg = context.getMessage();

                String[] mimeHeader = soapMsg.getSOAPPart().getMimeHeader("Content-type");

                for(String str : mimeHeader){
                    logger.info("Content-type = " + str);
                }

                Iterator attachments = soapMsg.getAttachments();

                while (attachments.hasNext()) {
                    logger.info("Message has attachment");
                    AttachmentPart att = (AttachmentPart) attachments.next();

                    if (att.getMimeHeader("Content-Disposition") == null)
                        continue;

                    String contentType = att.getContentType();
                    String[] parts = contentType.split(";");

                    Attachment attachment = new Attachment();
                    if (parts.length > 0) {
                        attachment.setContentType(parts[0]);
                    }
                    logger.info("ContentType = " + attachment.getContentType());
                    attachment.setInputStream(att.getDataHandler().getInputStream());

                    attachmentsInfo.addAttachment(attachment);
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