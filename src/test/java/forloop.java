import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class forloop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        int i;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        List<WebElement> l = driver.findElements(By.tagName("a"));
        System.out.println("number of hyperlinks=" + l.size());
        for (i = 1; i <= l.size();i++) {
            System.out.println(l.get(i).getText());

        }
        }
    }
