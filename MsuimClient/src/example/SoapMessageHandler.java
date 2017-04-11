package example;//Created by Arzamastsev on 07.04.2017.

import com.sun.xml.internal.ws.util.ByteArrayDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SoapMessageHandler implements SOAPHandler<SOAPMessageContext> {

    private List<byte[]> chunks;
    private int counter = 0;
    private String mimeType = "";
    private String contentId = "";
    private static final Logger logger = LoggerFactory.getLogger(SoapMessageHandler.class.getSimpleName());

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        logger.info("Start SOAPHandler<SOAPMessageContext>");
        SOAPMessage soapMessage = context.getMessage();

        for (byte[] chunk:chunks){
            ByteArrayDataSource dataSource = new ByteArrayDataSource(chunk, mimeType);
            logger.info("mimeType :  " + mimeType);
            logger.info("contentId :  " + contentId);
            DataHandler dh = new DataHandler(dataSource);
            AttachmentPart ap = soapMessage.createAttachmentPart(dh);
            ap.setContentId(contentId);
            ap.setContentType(mimeType);
            soapMessage.addAttachmentPart(ap);
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public void setChunks(List<byte[]> chunks) {
        this.chunks = chunks;
    }

    public List<byte[]> getChunks() {
        if(chunks == null){
            return new ArrayList<byte[]>();
        }
        return chunks;
    }
}

