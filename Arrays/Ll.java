import java.util.*;

public class Ll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("delhi");
        list.add("mumbai");
        list.add("dehradun");
        list.add("raipur");
        list.add("chennai");
        list.add("Rishikesh");
        System.out.println("LL elements are : " + list);

        list.add(2, "Chandigarh");
        System.out.println("After adding one elements: " + list);

        list.remove(4);
        System.out.println("After removing elements : " + list);

        // Get method
        System.out.println("after getting the elements :  " + list.get(3));

        // set method

        list.set(3, "Mohali");
        System.out.println("after set or update the elements : " + list);

        // list.clear();
        // System.out.println(list);
        // isEmpty method
        System.out.println("is list Empty ? " + list.isEmpty());
        // offer method
        list.offer("Saharanpur");
        System.out.println("aftet adding at end : " + list);

        // poll methods
        System.out.println("using poll method : " + list.poll());

        // peek method
        System.out.println("Peek methods : " + list.peek());

        

    }

}
