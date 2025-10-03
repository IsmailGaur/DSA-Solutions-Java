import java.util.*;
import java.util.stream.*;

public class streamInJava {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Mango", "Banana");

        // Stream<String> stream = list.stream();
        list.stream().forEach(System.out::println);

        // Stream<Integer> stream = Arrays.stream(new int[] { 2, 3, 4, 5, 2, 4
        // }).boxed();
        // stream.forEach(System.out::println);
    }

}