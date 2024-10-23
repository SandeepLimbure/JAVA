package Java_Programs_100;

import java.util.Scanner;

public class IfElseClause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age :- ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible for voting");
        }
        else{
            System.out.println("you are not eligible for voting");
        }
    }
}
