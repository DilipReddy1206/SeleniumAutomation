import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver a;
        WebDriverManager.chromedriver().setup();
        a=new ChromeDriver();
        a.get("https://www.amazon.in/");
        Thread.sleep(3000);
        a.manage().window().maximize();
        Thread.sleep(3000);
        a.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15", Keys.ENTER);
        //a.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("iphone15",Keys.ENTER);
        Thread.sleep(4000);
        a.navigate().back();
        Thread.sleep(3000);
        a.findElement(By.id("twotabsearchtextbox")).sendKeys("moong dal",Keys.ENTER);
        Thread.sleep(3000);
        a.findElement(By.id("twotabsearchtextbox")).clear();
        Thread.sleep(3000);


    }
}
