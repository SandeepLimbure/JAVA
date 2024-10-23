package Java_Programs_100;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :- ");
        int a = sc.nextInt();
        System.out.print("Enter num2 :- ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("the addition of two numbers is "+c);
        System.out.print("Enter num1 :- ");
        String num1 = sc.next();
        System.out.print("Enter num2 :- ");
        String num2 = sc.next();
        BigInteger BigInteger1 = new BigInteger(num1);
        BigInteger BigInteger2 = new BigInteger(num2);
        BigInteger sum;
        sum = BigInteger1.add(BigInteger2);
        System.out.println(sum);
    }
}
