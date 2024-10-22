package FunctionsMethods;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 :- ");
        int a = sc.nextInt();
        System.out.print("enter num1 :- ");
        int b = sc.nextInt();
        var sum = sum( a,b);
        System.out.println("sum of 2 numbers is :- "+sum);
    }
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
