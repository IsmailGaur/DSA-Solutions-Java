import java.util.*;
public class MaxSum_Kadans{
    public static int SubArraySum(int arr[]){
        int n = arr.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            currentSum +=arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum , maxSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {-1,3,2,-5,6,-6,7,2,5,-1,-1,8,-6};
        System.out.println(SubArraySum(arr));
    }
}