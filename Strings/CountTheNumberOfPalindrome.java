import java.util.*;

public class CountTheNumberOfPalindrome {
    public static int CountPalindrome(String str) {
        int n = str.length();

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sb = str.substring(i, j);
                System.out.println(sb);
                String rev = new StringBuilder(sb).reverse().toString();
                if (sb.equals(rev)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(CountPalindrome(str));
    }

}
