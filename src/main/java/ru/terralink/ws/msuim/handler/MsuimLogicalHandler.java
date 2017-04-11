package ru.terralink.ws.msuim.handler;//Created by Arzamastsev on 06.04.2017.

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.terralink.ws.common.Utils;
import ru.terralink.ws.msuim.Attachment;
import ru.terralink.ws.msuim.AttachmentsInfo;
import ru.terralink.ws.object.request.REDataExchangeAttrECD;
import ru.terralink.ws.object.request.REDataExchangeAttrFile;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MsuimLogicalHandler implements LogicalHandler<LogicalMessageContext> {

    private static final Logger logger = LoggerFactory.getLogger(MsuimLogicalHandler.class.getSimpleName());

    @Autowired
    @Qualifier("attachmentsInfo")
    private AttachmentsInfo attachmentsInfo;

    public MsuimLogicalHandler() {
    }

    public boolean handleMessage(LogicalMessageContext ctx)
    {
        Boolean outboundProperty = (Boolean)ctx.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (!outboundProperty.booleanValue()) {
            logger.info("MsuimLogicalHandler received message.");
            try {

                LogicalMessage message = ctx.getMessage();
                JAXBContext jaxbContext = JAXBContext.newInstance("ru.terralink.ws.object.request");
                JAXBElement jaxbPayload = (JAXBElement)message.getPayload(jaxbContext);
                REDataExchangeAttrECD data = (REDataExchangeAttrECD)jaxbPayload.getValue();
                List<REDataExchangeAttrFile> attrFiles = data.getAttrFile();

                logger.info("Message has " + attrFiles.size() + " attr file parts");
                HashMap<String,Attachment> attachments = new HashMap<>();

                for (REDataExchangeAttrFile attrFile : attrFiles){
                    String fileName = attrFile.getFILENAME();
                    if (!attachments.containsKey(fileName)){
                        int parts = attrFile.getAllParts().intValue();
                        Attachment attachment = new Attachment(fileName, parts);
                        attachments.put(fileName, attachment);
                    }

                }

                HashMap<String, Object> messageAttachments = (HashMap)ctx.get(MessageContext.INBOUND_MESSAGE_ATTACHMENTS);

                logger.info("Message has " + messageAttachments.size() + " attachments");

                for (Map.Entry<String, Object> entry : messageAttachments.entrySet()) {
                    String fileName = entry.getKey();
                    DataHandler handler = (DataHandler)entry.getValue();
                    String contentType = handler.getContentType().split(";")[0];
                    BufferedInputStream inputStream = new BufferedInputStream((handler).getInputStream());

                    byte[] content = Utils.toByteArray(inputStream);

                    Attachment attachment = attachments.get(fileName);
                    if (attachment!=null){
                        attachment.setContentType(contentType);
                        attachment.addPart(content);
                    }

                }

                Iterator it = attachments.entrySet().iterator();
                int i = 1;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry)it.next();

                    Attachment attachment = (Attachment)entry.getValue();
                    Utils.joinContent(attachment);

                    logger.info("MsuimLogicalHandler attachment: "+i+" content size : " + attachment.getContentLength());
                    attachmentsInfo.addAttachment(attachment);
                    i++;
                }



            }catch (Exception e) {
                logger.error(e.getMessage());
            }

        }

        return true;
    }


    @Override
    public boolean handleFault(LogicalMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }

}
