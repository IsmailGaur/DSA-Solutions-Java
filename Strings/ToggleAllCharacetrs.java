import java.util.Scanner;

public class ToggleAllCharacetrs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

        // Toggle
        // PHysiCs -> phYSIcS
        int n = sb.length();
        for (int i = 0; i < n; i++) {
            // P->p
            // Check alphabet - small , CAPITAl

            boolean flag = true;// true->capital
            char ch = sb.charAt(i);
            if (ch == ' ')
                continue;
            int asci = (int) ch;
            if (asci >= 97)
                flag = false; // small character

            if (flag == true) { // capital-> to smaLL
                asci += 32;
                char dh = (char) asci;
                sb.setCharAt(i, dh);
            } else {
                asci -= 32;
                char dh = (char) asci;
                sb.setCharAt(i, dh);
            }
        }
        System.out.println(sb);
    }

}
