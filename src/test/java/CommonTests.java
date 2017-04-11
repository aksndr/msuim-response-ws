import org.apache.commons.io.FilenameUtils;
import org.junit.Assert;
import ru.terralink.ws.common.Utils;
import ru.terralink.ws.msuim.Attachment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CommonTests {
    @org.junit.Test
    public void extensionTest(){
        String g = FilenameUtils.getExtension("bar.exe");
        g = FilenameUtils.getExtension("barexe");
        System.out.println(g);
    }


    @org.junit.Test
    public void splitNjoinTest() throws IOException {
        String pathSrc = "D:\\rnd\\docs\\ot\\Best_Practices_-_Applying_Update_2016-06_to_OpenText_Content_Server_10.pdf";
        String pathDst = "D:\\rnd\\docs\\ot\\TEEEEEESSSSTTTOOOOOOOOOOOOOOO.pdf";


        byte[] contentSrc = Files.readAllBytes(Paths.get(pathSrc));

        List<byte[]> parts = Utils.splitContent(contentSrc);

        for (int i=0; i < parts.size(); i++){
            String pathPart = "D:\\temp\\msuim\\Best_Practices_-_Applying_Update_2016-06_to_OpenText_Content_Server_10.pdf" + "_part" + (i+1);
            Files.write(Paths.get(pathPart), parts.get(i));
        }

        Attachment attachment = new Attachment("t", contentSrc.length);
        attachment.setParts(parts);

        Utils.joinContent(attachment);

        byte[] contentDst = attachment.getContent();

        Files.write(Paths.get(pathDst), contentDst);


        Assert.assertArrayEquals(contentSrc, contentDst);
        Assert.assertArrayEquals(Files.readAllBytes(Paths.get(pathSrc)), Files.readAllBytes(Paths.get(pathDst)));
    }

}
