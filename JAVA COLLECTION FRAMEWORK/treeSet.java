import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
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