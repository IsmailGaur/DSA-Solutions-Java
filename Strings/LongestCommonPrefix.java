import java.util.*;

public class LongestCommonPrefix {
    public static String CommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length - 1].toCharArray();
        int minLength = Math.min(first.length, last.length);
        for(int i = 0; i < minLength; i++){
            if(first[i] != last[i]){
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String[] strs = {"clap", "club", "clue"};
        String result = CommonPrefix(strs);
        System.out.println( result);
    }
}
