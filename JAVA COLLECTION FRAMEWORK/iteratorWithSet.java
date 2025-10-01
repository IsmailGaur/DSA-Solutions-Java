import java.util.*;

public class iteratorWithSet {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("dehradun");
        list.add("delhi");
        list.add("mumbai");
        list.add("Meerut");
        list.add("Rishikesh");
        list.add("Agra");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
