import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://the-internet.herokuapp.com/javascript_alerts");
        d.manage().window().maximize();
        Thread.sleep(3000);
        //d.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        d.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert a=d.switchTo().alert();
        Thread.sleep(2000);
        a.dismiss();
    }
}
