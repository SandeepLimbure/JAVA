package FunctionsMethods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num :- ");
        int a = sc.nextInt();
        fact(a);
    }
    public static void fact(int a){
        if(a<0){
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for(int i = 1;i<=a;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
