import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int a[] = {10, 0};
            int div;
            div = a[0] / a[1];
            Integer b=Integer.parseInt("10");
            System.out.println(b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Denominator is ZERO");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index is Incorrect");
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Array size is Negative");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Don't Enter strings instead of integer");
        }
        finally
        {
            System.out.println("Thank You");
        }
    }
}
