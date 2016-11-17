package ru.terralink.ws.msuim;

import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * Created by AzarovD on 03.02.2016.
 */
@Component("attachmentInfo")
public class AttachmentInfo {

    private String contentType;
    private InputStream inputStream;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
