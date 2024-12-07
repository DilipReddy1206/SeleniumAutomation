public class CubenotArmstrong {
    public static void main(String[] args) {
        int n,digit,sum,m;
        n=153;
        sum=0;
        m=n;
        while (n>0)
        {
            digit=n%10;
            sum=sum=digit*digit;
            n=n/10;
        }
        System.out.println("some of cubes="+sum);
        if (m==sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
