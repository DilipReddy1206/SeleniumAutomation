public class Square1 {
    int x,res;
    public int get(int x)
    {
        this. x=x;
        res=this.x*this.x;
        return(res);
    }

    public static void main(String[] args) {
        {
            Square1 s1=new Square1();
            System.out.println(s1.get(4));
        }
    }
}
