import java.util.*;

public class ArraysList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(31);
        list.add(546);
        list.add(43);
        list.add(2);
        System.out.println("unsorted list items are : " + list);
        System.out.println("size of list: " + list.size());
        Collections.sort(list);
        System.out.println("sorted list items are : " + list);

        Collections.reverse(list);
        System.out.println("Reversed list items are: " + list);

        int max = Collections.max(list);
        System.out.println("Max item from the list is : " + max);

        int min = Collections.min(list);
        System.out.println("min item from the list is : " + min);
    }
}