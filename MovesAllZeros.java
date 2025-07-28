import java.util.*;
public class MovesAllZeros {
    public static int[] ZerosAtEnd(int arr[]){
int count = 0;
    int n = arr.length;
    for(int i = 0; i <n; i++){
        if(arr[i]!= 0){
            arr[count++] = arr[i];
        }
    }
    while(count < n){
        arr[count++] = 0;
    }
    return arr;
}
public static void main(String args[]){
    int arr[] = {0,3,2,0,4,1,4,0,1};
    System.out.println(Arrays.toString(ZerosAtEnd(arr)));

}

}
