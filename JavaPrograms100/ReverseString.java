package Java_Programs_100;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a String :- ");
        String O = sc.next();
        String R = " ";
        for(int i = O.length()-1;i>=0;i--){
            R = R + O.charAt(i);
        }
        System.out.println(R);
    }
}
