import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> que = new PriorityQueue<>();
        que.add(21);
        que.add(32);
        que.add(43);
        que.add(1);
        que.add(654);
        que.add(76);
        System.out.println(que);
        System.out.println("size of the que Is : " + que.size());
    }

}
