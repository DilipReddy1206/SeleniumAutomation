import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LaunchBrowser {
    WebDriver d;
    @BeforeMethod
    public void launchingBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://www.google.com/");
        Thread.sleep(3000);
        d.manage().window().maximize();
    }

    @AfterMethod
    public void QuitBrowser() throws InterruptedException {
        Thread.sleep(2000);
        d.quit();
    }

    }
