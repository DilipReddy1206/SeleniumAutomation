import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testng {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.manage().window().maximize();
        Thread.sleep(3000);
        d.get("https://www.google.com/");
        d.findElement(By.name("q")).sendKeys("Banglore", Keys.ENTER);
        Thread.sleep(3000);
        d.quit();
    }
}
