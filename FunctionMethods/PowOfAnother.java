package FunctionsMethods;

import java.util.Scanner;

public class PowOfAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :- ");
        int a = sc.nextInt();
        System.out.print("Enter num2 :- ");
        int b = sc.nextInt();
        power(a,b);
    }
    public static void power(int n,int x){
        System.out.println((int)Math.pow(x,n));
    }
}
