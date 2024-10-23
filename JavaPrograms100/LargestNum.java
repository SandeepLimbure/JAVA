package Java_Programs_100;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 :- ");
        int a = sc.nextInt();
        System.out.print("enter num2 :- ");
        int b = sc.nextInt();
        System.out.print("enter num3 :- ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a +" is greater than "+b+" and "+c);
        }
        else if(b>a && b>c){
            System.out.println(b +" is greater than "+a+" and "+c);
        }
        else{
            System.out.println(c +" is greater than "+a+" and "+b);
        }
    }
}
