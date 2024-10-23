package Java_Programs_100;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :- ");
        int num = sc.nextInt();
        System.out.println("the multiplication table of "+num+" is :- ");
        for(int i = 1;i<=10;i++){
            int  mul = num*i;
            System.out.println(num+" x "+i+" = "+mul);
        }
    }
}
