import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver a;
        WebDriverManager.chromedriver().setup();
        a=new ChromeDriver();
        a.get("https://www.google.com/");
        a.manage().window().maximize();
        //a.findElement(By.id("APjFqb")).sendKeys("whatsapp web", Keys.ENTER);
        //Thread.sleep(5000);
        //a.navigate().back();
        a.findElement(By.id("APjFqb")).sendKeys("https://www.hotstar.com/in/home?ref=%2Fin",Keys.ENTER);
        Thread.sleep(3000);
        a.navigate().back();
    }
}
