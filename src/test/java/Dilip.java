import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dilip {
    //launch chrome browser land on book my show.com website and count number of due tags
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://in.bookmyshow.com/");
        Thread.sleep(3000);
        List<WebElement> l=driver.findElements(By.tagName("div"));
        System.out.println("number of hyperlinks="+l.size());
    }
}
