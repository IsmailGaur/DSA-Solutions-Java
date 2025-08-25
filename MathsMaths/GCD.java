public class GCD {

    public static int ReturnCGD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ReturnCGD(b, a % b);
    }

    public static void main(String args[]) {
        int a = 48;
        int b = 16;
        System.out.println(ReturnCGD(a, b));
    }
}
// int a = 124, b = 96;
// int gcd = 1;

// for (int i = 1; i <= Math.min(a, b); i++) {
// if (a % i == 0 && b % i == 0) {
// gcd = i;
// }
// }
// System.out.println("GCD is: " + gcd);

// }

// }
