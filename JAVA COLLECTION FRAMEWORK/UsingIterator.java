import java.util.*;

public class UsingIterator {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("dehradun");
        list.add("delhi");
        list.add("mumbai");
        list.add("Meerut");
        list.add("Rishikesh");
        list.add("Agra");

        // Iterator<String> it = list.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());

        // for (String cities : list) {
        // System.out.println(cities);
        // }

        // list.forEach(System.out::println);

        list.stream().filter(f -> f.startsWith("A")).forEach(System.out::println);

    }

}
