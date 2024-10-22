package FunctionsMethods;

import java.util.Scanner;

public class AverageThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 :- ");
        int a = sc.nextInt();
        System.out.print("enter num2 :- ");
        int b = sc.nextInt();
        System.out.print("enter num3 :- ");
        int c = sc.nextInt();
        average(a,b,c);
    }
    public static void average(int a,int b,int c){
        float avg = (float)(a+b+c)/3;
        System.out.println(avg);
    }
}
