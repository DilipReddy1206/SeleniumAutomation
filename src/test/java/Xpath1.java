import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
    public static void main(String[] args) throws InterruptedException {
        String msg;
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.ipl.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        msg=driver.findElement(By.xpath("//a[text()='Welcome to IPL']")).getText();
        System.out.println(msg);
        msg=driver.findElement(By.xpath("//em[text()='Cricket analysis, squad analysis, match Analysis, player analysis, the greatest test captain of all time, Cricket Analysis & Expert Views 2021, cricket opinion by experts and much more.']")).getText();
        System.out.println(msg);

    }
}
