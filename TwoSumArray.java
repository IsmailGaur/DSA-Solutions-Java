import java.util.*;
public class TwoSumArray {
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int sum =  numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{numbers[left], numbers[right]};
            }else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String args[]){
        int numbers[] = {3,4,5,6,7};
        int target = 8;
        int result[] = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
    
}

