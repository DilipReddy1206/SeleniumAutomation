import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteLauch {
    public static void main(String[] args) throws InterruptedException {
        String code,url,title;
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.findElement(By.id("APjFqb")).sendKeys("allu arjun", Keys.ENTER);
        //driver.findElement(By.className("gLFyf")).sendKeys("hyderabad",Keys.ENTER);
        //driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("bangalore",Keys.ENTER);
        //driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("rcb",Keys.ENTER);
        //driver.navigate().refresh();
        Thread.sleep(2000);
        //driver.navigate().back();
        //driver.close();
        //driver.findElement(By.linkText("Gmail")).click();
        //driver.findElement(By.partialLinkText("Sto")).click();
        //driver.findElement(By.tagName("textarea")).sendKeys("virat kohli",Keys.ENTER);
        //code=driver.getPageSource();
        //System.out.println("Code="+code);
        //url=driver.getCurrentUrl();
        //System.out.println("url="+url);
        //title=driver.getTitle();
        //System.out.println("title="+title);
    }
}
