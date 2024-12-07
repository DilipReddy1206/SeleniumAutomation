import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://www.facebook.com/");
        d.manage().window().maximize();
        Thread.sleep(3000);
        d.findElement(By.xpath("//a[text()='Create new account']")).click();
        d.findElement(By.name("firstname")).sendKeys("dilipreddy");
        d.findElement(By.name("lastname")).sendKeys("chinthaparthi");
        WebElement l= d.findElement(By.id("day"));
        Select s=new Select(l);
        s.selectByIndex(6-1);
        Thread.sleep(3000);
        WebElement f=d.findElement(By.id("month"));
        Select e=new Select(f);
        e.selectByVisibleText("Dec");
        Thread.sleep(3000);
        WebElement a=d.findElement(By.id("year"));
        Select b=new Select(a);
        b.selectByVisibleText("1997");
        Thread.sleep(3000);

    }
}
