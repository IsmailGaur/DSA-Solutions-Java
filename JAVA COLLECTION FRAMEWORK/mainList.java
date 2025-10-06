import java.util.*;

public class mainList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dehradun");
        list.add("Delhi");
        list.add("Mumbai");
        list.add("Kolkata");
        list.add("Chennai");
        System.out.println("All cities are " + list);
        list.add(3, "Rishikesh");
        // System.out.println(list);

        ListIterator<String> it = list.listIterator();

        System.out.println("it is forword iteration: ");
        while (it.hasNext()) {
            String city = it.next();
            if (city.equals("Delhi")) {
                it.add("Mussorrie");
            }

            System.out.println(it.next());
        }

        // Iterator<String> it = list.iterator();
        // ListIterator<String> it = list.listIterator();
        System.out.println("\nBackword Iteration:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
