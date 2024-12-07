import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void beforeSuit()
    {
        System.out.println("BeforeSuite");
    }
    @BeforeMethod
    public void beforeMetod()
    {
        System.out.println("BeforeMethod");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("BeforeClass");
    }
    @Test

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("AfterSuite");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("AfterClass");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("AfterMethod");
    }

}
