package Java_Programs_100;

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :- ");
        String a = sc.next();
        int length = a.length();
        for(int c = 0;c<length;c++){
            for(int i = 1;i<=length-c;i++){
                String sub = a.substring(c,c+i);
                System.out.println(sub);
            }
        }
    }
}
