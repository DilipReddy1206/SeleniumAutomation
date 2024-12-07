import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IndianExpress {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops=new ChromeOptions();
        ops.addArguments("--disable-notifications");
        d=new ChromeDriver(ops);
        d.get("https://indianexpress.com/");
        d.manage().window().maximize();
        Thread.sleep(3000);
       // d.findElement(By.className("//h1[@class='content_wall']/a")).getText();
        //String msg=d.findElement(By.xpath("//h1[@class='content_wall']/a")).getText();
        //System.out.println(msg);
        //String words[]=msg.split(" ");
        //for (String s:words)
        //{
            //System.out.println(s);
        //}
        d.findElement(By.linkText("ePaper")).click();
    }
}
