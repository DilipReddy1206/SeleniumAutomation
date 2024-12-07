import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class SoftAssertt extends LaunchBrowser {
    @Test
    public void sharelike() {
        String actualtitle, expectedtitle;
        actualtitle = "Google";
        expectedtitle = d.getTitle();
        SoftAssert ss = new SoftAssert();
        ss.assertEquals(actualtitle,expectedtitle,"finding the title");
     //  a.assertEquals(actualtitle, expectedtitle, "finding google");
        d.findElement(By.name("q")).sendKeys("bangalore", Keys.ENTER);
    }
}
