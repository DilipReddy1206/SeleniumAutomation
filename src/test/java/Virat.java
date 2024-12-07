public class Virat {
    public void sum(int x,int y,double z)
    {
        System.out.println("sum="+(x+y+z));
    }
    public void sum(double x,int y,int z)
    {
        System.out.println("sum="+(x+y+z));
    }
    public void sum(double x,double y,int z)
    {
        System.out.println("sum="+(x+y+z));
    }
    public static void main(String[] args) {
        Virat v1=new Virat();
        v1.sum(6,7,9.2);
        v1.sum(10.4,8,11);
        v1.sum(1.2,2.5,2);
    }
}
