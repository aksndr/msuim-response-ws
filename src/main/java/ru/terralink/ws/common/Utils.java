package ru.terralink.ws.common;//Created by Arzamastsev on 09.03.2017.

import org.apache.tika.config.TikaConfig;
import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

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

}
