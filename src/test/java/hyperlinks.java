import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class hyperlinks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        List<WebElement> l=driver.findElements(By.tagName("a"));
        System.out.println("number of hyperlinks="+l.size());
        int i = 1;
        while (i<=l.size())
        {
            //System.out.println(l.get(i).getText());
            System.out.println(l.get(i).getAttribute("href"));
            i++;
        }
    }
}
