import java.util.*;

public class utilityMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Before Adding:");
        list.add("dehradun");
        list.add("Delhi");
        list.add("Mumbai");
        list.add("Kolkata");
        list.add("Chennai");
        System.out.println(list);
        // adding elements
        list.add("Meerut");
        System.out.println("After adding : " + list);

        // adding on index
        list.add(4, "Shimla");
        System.out.println("New list is : " + list);

        // get method
        String s = list.get(2);
        System.out.println(s);
        // size method
        System.out.println(list.size());

        // Update method

        list.set(5, "Chandigarh");
        System.out.println("now list items are: " + list);
        // Remove method
        list.remove("Meerut");
        System.out.println("after removing list is : " + list);

        // clear method
        // list.clear();
        // System.out.println("after clearing the list : " + list);

        // Searching Method;
        System.out.println("City Conatins? " + list.contains("Shimla"));
        System.out.println("The index of city os : " + list.indexOf("Delhi"));
        System.out.println("is list empty? : " + list.isEmpty());

        // Utility Methods

        // list.clone();
        System.out.println("list clone is " + list.clone());
        String arr[] = list.toArray(new String[0]);
        for (String cities : arr) {
            System.out.println(cities);
        }

        // String arr[] = list.toArray();
    }
}
