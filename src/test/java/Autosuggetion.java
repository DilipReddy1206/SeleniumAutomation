import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Autosuggetion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://www.redbus.in/");
        d.manage().window().maximize();
        d.findElement(By.id("src")).sendKeys("bang");
        Thread.sleep(2000);
        List<WebElement> sp=d.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']/li"));
        Thread.sleep(2000);
        System.out.println("Number of Boarding points in Bangalore="+sp.size());
        for (WebElement w:sp)
        {
            if(w.getText().equalsIgnoreCase("Bangalore Airport Intl"))
            {
                w.click();
                break;
            }
        }
        d.findElement(By.id("dest")).sendKeys("hyd");
        Thread.sleep(2000);
        List<WebElement> bp=d.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']/li"));
        Thread.sleep(2000);
        System.out.println("Number of Boarding points in Hyderabad="+sp.size());
        for (WebElement w:bp)
        {
            if (w.getText().equalsIgnoreCase("Hyderabad Airport"))
            {
                w.click();
                break;
            }
        }

    }
}
