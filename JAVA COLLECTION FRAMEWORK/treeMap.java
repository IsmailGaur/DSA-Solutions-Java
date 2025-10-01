import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Sahil");
        map.put(2, "Amit");
        map.put(3, "Suraj");
        map.put(4, "Abhay");
        map.put(5, "Sagar");
        map.put(5, "Sahil");
        System.out.println(map);
        System.out.println(map.size());

    }

}
