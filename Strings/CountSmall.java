import java.util.*;
public class CountSmall {
    public static int countSmall(Set<String> set, String target) {
        int count = 0;
        String[] arr = set.toArray(new String[0]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(target) < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cat");
        stringSet.add("ant");
        stringSet.add("dog");
        String target = "cat";
        System.out.println("Count of strings smaller than '" + target + "': " + countSmall(stringSet, target));

        int arr[] = {5, 1, 0, 6, 2};
        List<Integer> result = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            result.add(treeSet.headSet(arr[i]).size());
            treeSet.add(arr[i]);
        }
        Collections.reverse(result);
        System.out.println("Smaller elements on the right: " + result);
    }
}