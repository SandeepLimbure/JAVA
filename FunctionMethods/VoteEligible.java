package FunctionsMethods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :- ");
        int a = sc.nextInt();
        Vote(a);
    }
    public static void Vote(int age){
        if(age>18){
            System.out.println("You are eligible for voting");
        }else{
            System.out.println("You are not eligible for voting");
        }
        do{
            System.out.println("shivani");
        }while(true);
    }
}
