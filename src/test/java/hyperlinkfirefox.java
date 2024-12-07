import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class hyperlinkfirefox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.mozilla.org/");
        Thread.sleep(3000);
    }
}
