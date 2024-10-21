package Methods;

import java.util.HashSet;

public class CheckVowels {
    public static void main(String[] args) {
       String s = "AIEEE";
       boolean res = check(s);
        System.out.println(res);
    }
    public static boolean check(String s){
        s = s.toLowerCase();
        HashSet<Character> res = new HashSet<>();
        res.add('a');
        res.add('e');
        res.add('i');
        res.add('o');
        res.add('u');
        boolean flag = false;
        for(int i = 0;i<s.length();i++){
            if(res.contains(s.charAt(i))){
                flag = true;
            }
        }
        return flag;
    }
}
