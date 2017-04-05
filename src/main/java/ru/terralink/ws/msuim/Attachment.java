package ru.terralink.ws.msuim;
//Created by Arzamastsev on 08.03.2017.

import java.io.InputStream;

public class Attachment {

    private String contentType;
    private InputStream inputStream;
    private byte[] content;

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

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

}
