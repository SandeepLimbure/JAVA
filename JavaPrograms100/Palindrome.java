package Java_Programs_100;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original,reverse;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number :- ");
        original = sc.next();
        reverse = "";
        int length = original.length();
        for(int i = length-1;i>=0;i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
