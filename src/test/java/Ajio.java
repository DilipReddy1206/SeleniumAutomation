import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajio {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://www.ajio.com/");
        d.manage().window().maximize();
        Thread.sleep(2000);
        Actions a=new Actions(d);
        WebElement c=d.findElement(By.xpath("//a[@class=' alignTag']"));
        a.moveToElement(c).build().perform();
        Thread.sleep(2000);
        WebElement c1=d.findElement(By.xpath("(//a[@class=' alignTag'])[2]"));
        a.moveToElement(c1).build().perform();
        Thread.sleep(2000);
    }
}
