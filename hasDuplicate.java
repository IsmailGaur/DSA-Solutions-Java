import java.util.*;
public class hasDuplicate{
    public static boolean CheckDuplicateValue(int nums[]){
        Set<Integer> s = new HashSet<>();

        for(int num : nums){
            if(s.contains(num)){
                return true;
            }
            s.add(num);
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6};
        System.out.println(CheckDuplicateValue(nums));

    }
}