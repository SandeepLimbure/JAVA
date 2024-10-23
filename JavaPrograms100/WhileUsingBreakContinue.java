package Java_Programs_100;

import java.util.Scanner;

public class WhileUsingBreakContinue {
    public static void main(String[] args) {
         int n;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("enter an integer :- ");
            n = scan.nextInt();
            if(n !=0){
                System.out.println("you entered "+n);
                continue;
            }else{
                break;
            }
        }
    }
}
