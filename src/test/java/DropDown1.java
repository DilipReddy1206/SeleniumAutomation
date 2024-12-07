import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
        d.get("https://www.wikipedia.org/");
        d.manage().window().maximize();
        Thread.sleep(3000);
        //List<WebElement> l = d.findElements(By.xpath("//select[@id='searchLanguage']/option"));
        //System.out.println("total no.of languages=" + l.size());
        //for (WebElement w : l) {
            //System.out.println(w.getText());
        WebElement l=d.findElement(By.id("searchLanguage"));
        Select s=new Select(l);
        s.selectByVisibleText("Asturianu");
        Thread.sleep(3000);
        s.selectByVisibleText("العربية");
        Thread.sleep(3000);
        s.selectByValue("ar");
        Thread.sleep(3000);
        s.selectByIndex(7);
        Thread.sleep(3000);
        }
    }
