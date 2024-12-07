import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASCIICODE {
    public static void main(String[] args) throws InterruptedException {
        WebDriver d;
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
        d.get("https://www.amazon.in/");
        d.manage().window().maximize();
        Thread.sleep(3000);
        d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15", Keys.ENTER);
        //String msg=d.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro (128 GB) - Blue Titanium'")).getText();
        String msg=d.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']")).getText();
        //System.out.println(msg);
        //String words[]=msg.split(" ");
        //for (String s:words)
        //{
            //System.out.println(s);
        //}
        int l,uc,lc,nc,sc;
        char ch;
        l=msg.length();
        uc=0;
        lc=0;
        lc=0;
        nc=0;
        sc=0;
        for (int i=0;i<l;i++) {
            ch = msg.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                uc++;
            } else if (ch >= 'a' && ch <= 'z') {
                lc++;
            } else if (ch >= '0' && ch <= '9') {
                nc++;
            } else {
                sc++;
            }
        }
        System.out.println("No.of uc="+uc);
        System.out.println("No.of lc="+lc);
        System.out.println("No.of nc="+nc);
        System.out.println("No.of sc="+sc);
    }
}
