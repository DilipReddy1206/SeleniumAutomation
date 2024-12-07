import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DilipFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\dilip\\IdeaProjects\\SeleniumAutomation\\src\\test\\java\\dilip.properties");
        Properties p=new Properties();
        p.load(fis);
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("age"));
        System.out.println(p.getProperty("height"));

    }
}
