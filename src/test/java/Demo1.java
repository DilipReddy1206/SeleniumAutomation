import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver a;
        WebDriverManager.chromedriver().setup();
        a=new ChromeDriver();
        a.get("https://www.google.com/");
        Thread.sleep(5000);
        a.manage().window().maximize();
        Thread.sleep(3000);
        a.findElement(By.id("APjFqb")).sendKeys("bangalore", Keys.ENTER);
        a.findElement(By.className("gLFyf")).sendKeys("bangalore",Keys.ENTER);
        Thread.sleep(3000);
        a.close();
    }
}
