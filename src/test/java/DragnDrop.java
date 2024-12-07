import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://the-internet.herokuapp.com/drag_and_drop");
        d.manage().window().maximize();
        Thread.sleep(3000);
        Actions a=new Actions(d);
        WebElement s=d.findElement(By.xpath("//div[@id='column-a']"));
        WebElement e=d.findElement(By.xpath("//div[@id='column-b']"));
        a.dragAndDrop(e,s).build().perform();

    }
}
