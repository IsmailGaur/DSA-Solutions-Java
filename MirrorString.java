 import java.util.*;

public class MirrorString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String mirror = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            mirror += str.charAt(i);
        }
        System.out.println(mirror);
        sc.close();
    }
}