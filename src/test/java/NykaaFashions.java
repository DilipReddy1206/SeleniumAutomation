import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NykaaFashions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver n;
        WebDriverManager.chromedriver().setup();
        n=new ChromeDriver();
        n.get("https://www.nykaafashion.com/");
        n.manage().window().maximize();
        Thread.sleep(3000);
       // n.findElement(By.className("css-d040mp")).sendKeys("shoes for men", Keys.ENTER);
        //Thread.sleep(3000);
        n.findElement(By.linkText("")).click();


    }
}
