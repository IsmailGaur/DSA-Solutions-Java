import java.util.*;

public class iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dehradun");
        list.add("delhi");
        list.add("mumbai");
        list.add("Meerut");
        list.add("Rishikesh");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String city = it.next();
            System.out.println(city);
        }

    }
}
