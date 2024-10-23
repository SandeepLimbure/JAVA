package Java_Programs_100;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string1 :- ");
        String a = scan.next();
        System.out.print("Enter string2 :- ");
        String b = scan.next();
        if (a.compareTo(b)>0) {
            System.out.println("string a is greater than string b");
        } else if (a.compareTo(b)<0) {
            System.out.println("string b is greater than string a");
        }
        else{
            System.out.println("Both the strings are equal");
        }

    }
}
