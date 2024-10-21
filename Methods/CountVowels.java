package Methods;

import java.util.HashSet;

public class CountVowels {
    public static void main(String[] args) {
        String S = "w3resource";
        int res = count(S);
        System.out.println(res);
    }
    public static int count(String S){
        int count = 0;
        HashSet<Character> res = new HashSet<>();
        res.add('a');
        res.add('e');
        res.add('i');
        res.add('o');
        res.add('u');
        for(int i = 0;i<S.length();i++){
            if(res.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
