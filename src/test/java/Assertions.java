import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertions {
    public static void main(String[] args) {
        String actual,expected;
        actual="mpl";
        expected="tpt";
        //Assert.assertEquals(actual,expected,"both are different");
        //System.out.println("Dilip");
        //System.out.println("Obulreddy");
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actual,expected,"both are different");
        System.out.println("Dilip");
        System.out.println("Virat");
        sa.assertAll();
    }
}
