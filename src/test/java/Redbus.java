import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
    public static void main(String[] args) throws InterruptedException {
        WebDriver a;
        WebDriverManager.chromedriver().setup();
        a=new ChromeDriver();
        a.get("https://www.redbus.com/");
        a.manage().window().maximize();
        Thread.sleep(3000);
        a.findElement(By.id("return-box")).sendKeys("redbus", Keys.ENTER);
        Thread.sleep(3000);
    }
}
