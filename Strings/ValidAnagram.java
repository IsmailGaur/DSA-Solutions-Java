import java.util.*;

public class ValidAnagram {
    public static boolean CheckAnagram(String s , String t){
        if(s.length() !=t.length()){
            return false;
        }
        int n = s.length();
        int m = t.length();

        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i =0; i <n;i++){
        if(c1[i]!= c2[i]){
            return false;
        }
    }
        return true;

    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(CheckAnagram(s,t));

    }
    
}
