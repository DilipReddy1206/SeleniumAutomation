public class Browsers {
    String name,company,year;
    int downloads;
    double rating;
    public void BrowserInput(String a,String b,String c, int d, double f)
    {
        name=a;
        company=b;
        year=c;
        downloads=d;
        rating=f;
    }
    public void BrowserOutput()
    {
        System.out.println("Name="+name);
        System.out.println("Company="+company);
        System.out.println("Year="+year);
        System.out.println("Downloads="+downloads);
        System.out.println("Rating="+rating);
    }

    public static void main(String[] args) {
        Browsers b1=new Browsers();
        Browsers b2=new Browsers();
        Browsers b3=new Browsers();
        b1.BrowserInput("chrome","google","1997",10000,5.5 );
        b2.BrowserInput("edge","microsoft","1998",15000,6.5);
        b3.BrowserInput("firefox","mozilla","1999",20000,7.8);
        b1.BrowserOutput();
        b2.BrowserOutput();
        b3.BrowserOutput();
    }
}

