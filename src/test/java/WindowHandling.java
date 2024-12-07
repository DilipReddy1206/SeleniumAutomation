import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.get("https://www.amazon.in/");
        d.manage().window().maximize();
        Thread.sleep(3000);
        d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15 pro", Keys.ENTER);
        d.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro (256 GB) - Black Titanium']")).click();
        String w1 = d.getWindowHandle();
        Set<String> w2 = d.getWindowHandles();
        for (String S : w2) {
            d.switchTo().window(S);
        }
        Thread.sleep(2000);
        String msg = d.findElement(By.id("productTitle")).getText();
        System.out.println(msg);
        d.quit();
    }
}