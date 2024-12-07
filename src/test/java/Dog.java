public class Dog {
    String breed,colour;
    int cost;
    /*Dog(String a,String b,int c)
    {
        breed=a;
        colour=b;
        cost=c;
    }*/
    public void DogOutput()
    {
        System.out.println(breed+colour+cost);
    }

    public static void main(String[] args)
    {
       Dog d1=new Dog();
       Dog d2=new Dog();
       d1.DogOutput();
       d2.DogOutput();
    }
}
