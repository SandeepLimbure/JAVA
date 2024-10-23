package Java_Programs_100;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println(num+" is an even number");
        }
        else{
            System.out.println(num+" is an odd number");
        }
    }
}
