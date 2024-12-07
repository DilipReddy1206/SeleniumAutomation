public class Nestedforloop3 {
    public static void main(String[] args) {
        int i, j, k, n, l;
        n = 4;
        for (i = n; i>=1; i--) {
            for (j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (l = 1; l < i; l++) {
                System.out.print(l);
            }
            System.out.println(" ");
        }
    }
}
