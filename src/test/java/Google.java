import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        String code,url;
        WebDriver m;
        WebDriverManager.chromedriver().setup();
        m=new ChromeDriver();
        m.get("https://www.google.com/");
        m.manage().window().maximize();
        Thread.sleep(4000);
        //m.findElement(By.linkText("Images")).click();
        //m.findElement(By.linkText("Gmail")).click();
        //m.findElement(By.partialLinkText("Ima")).click();
        //m.findElement(By.partialLinkText("Igs")).click();
        //m.findElement(By.partialLinkText("ges")).click();
        //m.findElement(By.partialLinkText("age")).click();
        //code=m.getPageSource();
        //System.out.println(code);
        url=m.getCurrentUrl();
        System.out.println(url);

    }
}
