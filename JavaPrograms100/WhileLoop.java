package Java_Programs_100;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
       int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer :- ");
        while((n=input.nextInt())!=0){
            System.out.println("you entered "+n);
            System.out.println("Input an integer :- ");
        }
        System.out.println("Out of loop");
    }
}
