import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(31);
        set.add(546);
        set.add(43);
        set.add(3);
        System.out.println(set);
        System.out.println("size of set : " + set.size());
    }
}