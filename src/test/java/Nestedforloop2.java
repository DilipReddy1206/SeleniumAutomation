public class Nestedforloop2 {
    public static void main(String[] args) {
        int i,j,k,n;
        n=4;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for (k=1;k<=i;k++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }


    }
}
