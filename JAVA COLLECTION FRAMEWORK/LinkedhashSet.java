import java.util.*;

public class LinkedhashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(3);
        set.add(314);
        set.add(546);
        set.add(43);
        set.add(3);
        System.out.println(set);
        System.out.println("size of set : " + set.size());
    }
}
