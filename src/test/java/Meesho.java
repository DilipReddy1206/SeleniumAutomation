import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {
    public static void main(String[] args) throws InterruptedException {
        String url,code,title;
        WebDriver m;
        WebDriverManager.chromedriver().setup();
        m=new ChromeDriver();
        m.get("https://www.meesho.com/");
        m.manage().window().maximize();
        Thread.sleep(3000);
        m.findElement(By.className("sc-eDvSVe gUjMRV sc-jsTgWu buaAYH search-input-elm sc-jsTgWu buaAYH search-input-elm")).sendKeys("shirt", Keys.ENTER);
        //m.navigate().refresh();
        //code=m.getPageSource();
        //System.out.println("code="+code);
        //url=m.getCurrentUrl();
        //System.out.println("url="+url);
        //title=m.getTitle();
        //System.out.println("title="+title);

    }
}
