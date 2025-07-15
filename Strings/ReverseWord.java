public class ReverseWord {
    public static String wordReversed(String s){
       String S = s.trim().replaceAll("\\s+", " ");
       String words[] = S.split(" ");
       StringBuilder sb = new StringBuilder();

       for(int i = words.length-1; i>=0;i--){
        sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();


    }
    public static void main(String args[]){
        String s = " Hello world ";
        System.out.println(wordReversed(s));
    }

    
}
