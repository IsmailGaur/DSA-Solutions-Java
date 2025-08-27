import java.time.chrono.IsoChronology;

public class ArmstrongNumber {
    public static void main(String args[]) {
        int n = 371;
        int OrgNum = n;
        int result = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int LastDigit = n % 10;
            result += Math.pow(LastDigit, digits);
            n = n / 10;
        }
        if (result == OrgNum) {
            System.out.println(OrgNum + " is a armstrong number :");
        } else {
            System.out.println(OrgNum + " is not a armstrong number");
        }
    }

}
