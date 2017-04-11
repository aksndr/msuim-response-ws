package ru.terralink.ws.common;//Created by Arzamastsev on 09.03.2017.

import com.sun.jmx.remote.internal.ArrayQueue;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import ru.terralink.ws.msuim.Attachment;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Utils {

    public static String getExtensionByMimeType(String contentType) throws MimeTypeException {
        TikaConfig config = TikaConfig.getDefaultConfig();
        MimeTypes allTypes = config.getMimeRepository();
        MimeType t = allTypes.forName(contentType);
        return t.getExtension();
    }

    public static byte[] toByteArray(InputStream is) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int reads = 0;
        reads = is.read();
        while (reads != -1) {
            baos.write(reads);
            reads = is.read();
        }
        baos.flush();
        baos.close();

        return baos.toByteArray();
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

    public static void joinContent(Attachment attachment) {
        if (attachment.getPartsSize() > 1){

            for (byte[] part : attachment.getParts()){
                int aLen = attachment.getContentLength();
                int bLen = part.length;
                byte[] tmp = new byte[aLen+bLen];
                System.arraycopy(attachment.getContent(), 0, tmp, 0, aLen);
                System.arraycopy(part, 0, tmp, aLen, bLen);
                attachment.setContent(tmp);
            }
        } else {
            attachment.setContent(attachment.getParts().get(0));
        }
        attachment.setParts(null);
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

}
