import java.util.*;
public class MaxSum_SubArray{
    public static int SubArray(int arr[]){
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int currentSum = 0;
            for(int j = i; j < n; j++){
                currentSum +=arr[j];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1,2,-3,-1,3,1,-5,-7,-4,1,4,-1,4,7};
        System.out.println((SubArray(arr)));
    }
}