package ru.terralink.ws.msuim;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("attachmentsInfo")
public class AttachmentsInfo {

    public AttachmentsInfo() {
    }

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
