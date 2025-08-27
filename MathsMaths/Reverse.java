public class Reverse {
    public static void main(String args[]) {
        int n = 2134;
        int rev = 0;

        while (n != 0) {
            int LastDigit = n % 10;
            rev = rev * 10 + LastDigit;
            n = n / 10;
        }
        System.out.println("Reversed Number is : " + rev);
    }
}