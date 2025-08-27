public class AllDivisor {
    public static void main(String[] args) {
        int n = 36; // you can change this number

        // System.out.print("Divisors of " + n + " are: ");
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
}
