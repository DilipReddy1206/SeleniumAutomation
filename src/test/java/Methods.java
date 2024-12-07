public class Methods {
    String accNo,name;
    int bal;
    public void mpl()
    {
        accNo="987654321";
        name="DilipReddy";
        bal=20000;
    }
    public void tpt()
    {
        System.out.println("AccountNumber="+accNo);
        System.out.println("Name="+name);
        System.out.println("Balance="+bal);
    }
    public static void main(String[] args) {
        Methods d=new Methods();
        d.mpl();
        d.tpt();
    }
}

