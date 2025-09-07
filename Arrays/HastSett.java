
import java.util.*;

public class HastSett {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(2);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);
        if (set.contains(2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
