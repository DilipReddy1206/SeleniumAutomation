import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.net.URL;

public class flipkart {
    public static void main(String[] args) throws InterruptedException {
        String code,url,title;
        WebDriver f;
        WebDriverManager.chromedriver().setup();
        f=new ChromeDriver();
        f.get("https://www.flipkart.com/");
        f.manage().window().maximize();
        Thread.sleep(4000);
        //f.findElement(By.className("Pke_EE")).sendKeys("vivo v30", Keys.ENTER);
        //f.navigate().back();
        //f.findElement(By.name("q")).sendKeys("shoes",Keys.ENTER);
        //Thread.sleep(3000);
        //f.navigate().refresh();
        //code=f.getPageSource();
        //System.out.println("code="+code);
        //url = f.getCurrentUrl();
        //System.out.println("url="+url);
        //title=f.getTitle();
        //System.out.println("title="+title);
        //f.findElement(By.linkText("Appliances")).click();
        //f.findElement(By.partialLinkText("ces")).click();
        //System.out.println();
    }
}
