import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class RunBrowser extends LaunchBrowser {
    @Test(priority = 1)
    public void search() throws InterruptedException {
        d.findElement(By.name("q")).sendKeys("facebook", Keys.ENTER);
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void Back() throws InterruptedException {
        d.navigate().back();
        Thread.sleep(3000);
        d.findElement(By.name("q")).sendKeys("amazon", Keys.ENTER);
    }

}
