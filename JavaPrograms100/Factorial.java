package Java_Programs_100;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = scan.nextInt();
        if(num==1 || num==0){
            System.out.println("the factorial of "+num+" is "+fact);
            return;
        }
        for(int i = 1;i<=num;i++){
            fact *= i;
        }
        System.out.println("the factorial of "+num+" is "+fact);
    }
}
