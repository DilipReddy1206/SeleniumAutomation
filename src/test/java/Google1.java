import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://www.google.com/");
        d.manage().window().maximize();
        Thread.sleep(2000);
        d.findElement(By.className("gLFyf")).sendKeys("allu arjun", Keys.ENTER);

    }
}
