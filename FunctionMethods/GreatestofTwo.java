package FunctionsMethods;

import java.util.Scanner;

public class GreatestofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :- ");
        int a = sc.nextInt();
        System.out.print("Enter num2 :- ");
        int b = sc.nextInt();
        greatest(a,b);
    }
    public static void greatest(int a,int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        System.out.println(Math.max(a,b));
    }
}
