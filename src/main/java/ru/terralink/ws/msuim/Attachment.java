package ru.terralink.ws.msuim;
//Created by Arzamastsev on 08.03.2017.

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Attachment {

    private String fileName;
    private String contentType;
    private InputStream inputStream;
    private byte[] content = new byte[]{};
    private List<byte[]> parts;

    public Attachment() {}

    public Attachment(String fileName, int partsSize) {
        this.fileName = fileName;
        this.parts = new ArrayList<>(partsSize);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

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

    public int getContentLength() {
        return content == null ? 0 : content.length;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public List<byte[]> getParts() {
        return parts;
    }

    public void setParts(List<byte[]> parts) {
        this.parts = parts;
    }

    public void addPart(byte[] part){
        this.parts.add(part);
    }

    public int getPartsSize(){
        return this.parts.size();
    }
}
