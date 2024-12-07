public class Polymorphism {
    public void sum(int x)//same method is repeated no.of times with same data type
    {
        System.out.println("addition="+(x+x));
    }
    public void sum(int x,int y)
    {
        System.out.println("addition="+(x+y));
    }
    public void sum(int x,int y,int z)
    {
        System.out.println("addition="+(x+y+z));
    }
    //public void sum(int a,int b)//same method is repeated no.of times with different data type
    {
        //System.out.println("addition="+(a+b));
    }
    public static void main(String[] args) {
        Polymorphism a1=new Polymorphism();
        a1.sum(3);
        a1.sum(6,7);
        a1.sum(8,10,11);
    }
}
