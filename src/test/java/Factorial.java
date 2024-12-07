public class Factorial {
    public static void main(String[] args) {
        int n,i,f=0;
        n=5;
        i=1;
        f=1;
        while (i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println("f="+f);
    }
}
