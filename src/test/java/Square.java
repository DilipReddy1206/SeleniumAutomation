public class Square {
    int x;
    public void get(int x)
    {
        this.x=x;
    }
    public int put()
    {
        return (x*x);
    }

    public static void main(String[] args) {
        Square s1=new Square();
        s1.get(4);
        System.out.println(s1.put());
    }
}
