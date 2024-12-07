import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumException {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://www.google.com/");
        Thread.sleep(3000);
        d.manage().window().maximize();
        d.findElement(By.name("q")).sendKeys("bangalore");
        Thread.sleep(3000);
    }
}
