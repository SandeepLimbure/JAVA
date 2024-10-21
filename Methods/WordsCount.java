package Methods;

public class WordsCount {
    public static void main(String[] args) {
       String s = "The quick brown fox jumps over the lazy dog.";
       int res = count(s);
        System.out.println(res);
    }
    public static int count(String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
}
