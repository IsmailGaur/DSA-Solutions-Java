public class Palindrome {
    public static void main(String args[]) {
        int Rem = 0;
        int n = 1212;

        int org = n;

        while (n != 0) {
            int LastDigit = n % 10;
            Rem = Rem * 10 + LastDigit;
            n = n / 10;

        }
        if (org == Rem) {
            System.out.println(org + " is a palindrome Number: ");
        } else {
            System.out.println(org + " is not a palindrome number:");
        }
    }

}
