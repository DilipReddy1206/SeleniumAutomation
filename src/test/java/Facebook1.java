import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook1 extends LaunchBrowser{
    @Test
    public void sharelike()
    {
        String actualtitle,expectedtitle;
        actualtitle="Google";
        expectedtitle=d.getTitle();
        Assert.assertEquals(actualtitle,expectedtitle,"finding google");
        d.findElement(By.name("q")).sendKeys("bangalore", Keys.ENTER);
    }
}
