import java.util.*;
public class RemoveDuplicates{
    public static int Remove_Duplicates_values(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        int count = 1;
        for(int i = 1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,3,4};
        System.out.println(Remove_Duplicates_values(arr));
    }
}