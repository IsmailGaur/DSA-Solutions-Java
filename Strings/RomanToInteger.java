import java.util.*;
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer>map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int n = s.length();
        int result = 0;

        for(int i =0; i<n;i++){
            int value = map.get(s.charAt(i));
            if(i < n-1 && value <map.get(s.charAt(i +  1))){
                result -=value;
                }else{
                    result +=value;
                }
        }
        return result;
    }
    public static void main(String args[]){
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
        }
}