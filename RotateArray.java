import java.util.*;

public class RotateArray{
    public static int[] Rotate(int arr[] , int k){
        int n = arr.length;
        // k = k % n;
        //Reverse Full array
        reverse(arr, 0 , n-1);

        //Reverse from 0 to k-1
        reverse(arr, 0 , k-1);

        //reverse from k to n-1
        reverse(arr, k , n-1);
        return arr;
    }
    public static void reverse(int arr[],  int start ,  int end){
        while( start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(Rotate(arr,k)));
    }
}