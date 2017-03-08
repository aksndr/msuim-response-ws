package ru.terralink.ws.msuim;

import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AzarovD on 03.02.2016.
 * Modified by Arzamastsev AV on 08.03.2017
 */
@Component("attachmentsInfo")
public class AttachmentsInfo {

    private List<Attachment> attachments = new ArrayList<>();

    public List getAttachments() {
        return attachments;
    }

    public Attachment getAttachment(int index){
        return this.attachments.get(index);
    }

    public void setAttachments(List attachments) {
        this.attachments = attachments;
    }

    public void addAttachment(Attachment attachment){
        this.attachments.add(attachment);
    }
}
