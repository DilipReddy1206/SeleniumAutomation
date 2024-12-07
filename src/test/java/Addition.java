public class Addition {
    public void sum(int x,int y)
    {
        System.out.println("sum="+(x+y));
    }
    public void sum(double x,double y)//same method repeated with different data types
    {
        System.out.println("sum="+(x+y));
    }
    public void sum(String x,String y)
    {
        System.out.println("sum="+(x+y));
    }

    public static void main(String[] args)
    {
        Addition a1=new Addition();
        a1.sum(6,7);
        a1.sum(6.2,8.4);
        a1.sum("Dilip","Reddy");
    }
}
