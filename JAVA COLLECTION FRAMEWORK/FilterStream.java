import java.util.Arrays;
import java.util.List;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 4, 24, 6, 5, 67);
        num.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }

}
