import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Differentbrowsers {
    public static void main(String[] args) {
        WebDriver driver=null;
        int choice;
        choice=2;
        if (choice==1)
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (choice==2)
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if (choice==3)
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.get("https://www.microsoft.com/");

    }
}
