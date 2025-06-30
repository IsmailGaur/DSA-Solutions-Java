import java.util.*;
public class ThreeSum{
    public static int[] Find3Sum(int numbs[]){
        int n = numbs.length;
        Arrays.sort(numbs);
        for(int i = 0; i < n; i++){
            for(int j =i+1; j < n; j++){
                for(int k = i+2; k < n; k++){
                int sum = numbs[i] + numbs[j] + numbs[k];
                if(sum == 0){
                    return new int[] {numbs[i] , numbs[j] ,numbs[k]};
                }
            }
        }
    }
    return new int[] {};
    }
    public static void main(String args[]){
        int numbs[] = {0, 1,1,-1,2,3,1,-2,-1,2,1};
        int result[] = Find3Sum(numbs);
        System.out.println(Arrays.toString(result));
    }
}