import org.testng.annotations.IAnnotation;
import org.testng.annotations.Test;

public class InvocationCount extends LaunchBrowser {
    @Test(invocationCount = 10)
    public void search()
    {
        System.out.println("Venom");
    }
}
