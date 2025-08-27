import java.util.Scanner;

public class Count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number: " + n);
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}