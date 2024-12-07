import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edge {
    public static void main(String[] args) {
        WebDriver edge;
        WebDriverManager.chromedriver().setup();
        edge= new ChromeDriver();
        edge.get("https://www.microsoft.com/");
    }
}
