public class ExceptionHandling {
    public static void main (String[] args) {
        try {
            int a, b, div;
            a = 10;
            b = 2;
            div = a / b;
            System.out.println("div=" + div);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }
        finally {
            System.out.println("Thank you");
        }
    }

    }
