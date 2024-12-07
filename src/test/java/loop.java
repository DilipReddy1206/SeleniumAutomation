public class loop {
    public static void main(String[] args) {
        int n,i,fact;
        n=4;
        i=1;
        fact=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("fact="+fact);
    }
}
