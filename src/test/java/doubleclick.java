import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class doubleclick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://demoqa.com/buttons");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        Actions a=new Actions(d);
        WebElement s=d.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        a.doubleClick(s).build().perform();
    }
}
