public class Reverse {
    public static void main(String[] args) {
        int n,digit,rev,m;
        n=122;
        rev=0;
        m=n;
        while (n>0)
        {
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("Reverse="+rev);
        if (m==rev)
        {
            System.out.println("palindrom");
        }
        else
            System.out.println("not palindrom");
    }
}
