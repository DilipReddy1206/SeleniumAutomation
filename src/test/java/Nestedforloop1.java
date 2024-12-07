public class Nestedforloop1 {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
