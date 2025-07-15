public class Pallindrome {
    public static boolean Ispalindrome(String s){
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(left < right){
            if(s.charAt(left) !=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        String s = "aba";
        System.out.println(Ispalindrome(s));

    }
}
