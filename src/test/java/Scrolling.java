import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.get("https://www.amazon.in/");
        d.manage().window().maximize();
        Thread.sleep(3000);
        d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15 pro", Keys.ENTER);
        JavascriptExecutor Js=(JavascriptExecutor)d;
        Js.executeScript("window.scrollBy(10,500)");
        Thread.sleep(3000);
        Js.executeScript("window.scrollBy(200,1500)");
        Thread.sleep(3000);
        Js.executeScript("window.scrollBy(600,500)");
        
    }
}
