import java.util.*;

public class IfEven {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(33);
        set.add(32);
        set.add(12);
        set.add(53);
        set.add(11);
        set.add(24);
        set.add(43);
        set.add(44);
        set.add(16);
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 = 0) {
                System.out.println(num);
            }
        }
    }

}
