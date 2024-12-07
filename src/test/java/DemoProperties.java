import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputStream fis=new FileInputStream("C:\\Users\\dilip\\IdeaProjects\\SeleniumAutomation\\src\\test\\java\\config.properties");
        Properties p=new Properties();
        p.load(fis);
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(p.getProperty("url"));
        Thread.sleep(2000);
        driver.findElement(By.name(p.getProperty("name"))).sendKeys(p.getProperty("place"),Keys.ENTER);

    }
}
