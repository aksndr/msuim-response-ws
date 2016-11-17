import org.apache.commons.io.FilenameUtils;

public class CommonTests {
    @org.junit.Test
    public void extensionTest(){
        String g = FilenameUtils.getExtension("bar.exe");
        g = FilenameUtils.getExtension("barexe");
        System.out.println(g);
    }

}
