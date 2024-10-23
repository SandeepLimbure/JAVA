package Java_Programs_100;

import java.util.Scanner;

public class Swap2With3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :- ");
        int a = sc.nextInt();
        System.out.print("Enter num2 :- ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}
