import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://the-internet.herokuapp.com/javascript_alerts");
        d.manage().window().maximize();
        Thread.sleep(2000);
        d.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert a=d.switchTo().alert();
        a.sendKeys("dilipreddy");
        a.accept();
        Thread.sleep(3000);

    }
}
