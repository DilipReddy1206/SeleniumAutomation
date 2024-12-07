import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
    public static void main(String[] args) throws InterruptedException {
        String code,url,title;
        WebDriver f;
        WebDriverManager.chromedriver().setup();
        f=new ChromeDriver();
        f.get("https://www.facebook.com/");
        f.manage().window().maximize();
        Thread.sleep(5000);
        code=f.getPageSource();
        System.out.println(code);
        url=f.getCurrentUrl();
        System.out.println(url);
        title= f.getTitle();
        System.out.println(title);
        f.close();
    }
}
