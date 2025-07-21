public class MinWindowSubString {
    public static int firstOccurance(String heyStack , String needle){
        int n = heyStack.length();
        int m = needle.length();

        for(int i = 0; i <=n-m; i++){
            if(heyStack.substring(i , i+m).equals(needle)){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        String heyStack = "textbook";
        String needle = "book";
        System.out.println(firstOccurance(heyStack, needle));
    }

}
