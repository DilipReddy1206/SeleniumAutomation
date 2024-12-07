public class SBI {
    String accNo,name;
    int bal;
    public void detailsInput(String a,String n,int b)
    {
        accNo="a";
        name="n";
        bal=b;
    }
    public void detailsOutput()
    {
        System.out.println(accNo+name+bal);
    }

    public static void main(String[] args) {
        SBI s1=new SBI();
        SBI s2=new SBI();
        s1.detailsInput("123","DilipReddy",2000);
        s1.detailsOutput();
        s2.detailsInput("456","anil",453);
        s2.detailsOutput();
    }
}
