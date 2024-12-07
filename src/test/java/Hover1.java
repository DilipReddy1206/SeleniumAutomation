import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://the-internet.herokuapp.com/hovers");
        d.manage().window().maximize();
        Thread.sleep(3000);
        Actions a=new Actions(d);
        WebElement m=d.findElement(By.xpath("(//img)[4]"));
        a.moveToElement(m).build().perform();
        Thread.sleep(2000);
        WebElement m1=d.findElement(By.xpath("(//img)[3]"));
        a.moveToElement(m1).build().perform();
        Thread.sleep(2000);
        WebElement m2=d.findElement(By.xpath("(//img)[2]"));
        a.moveToElement(m2).build().perform();
        Thread.sleep(2000);
        WebElement m3=d.findElement(By.xpath("(//img)[1]"));
        a.moveToElement(m3).build().perform();
        Thread.sleep(2000);
    }
}
