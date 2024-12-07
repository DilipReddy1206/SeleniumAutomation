import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indusbank {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://www.indusind.com/");
        d.manage().window().maximize();
        Thread.sleep(2000);
        d.findElement(By.xpath("//div[text()='Personal Banking']")).getText();
        d.findElement(By.xpath("(//*[starts-with(@d,'M13')])[3]")).click();

    }
}
