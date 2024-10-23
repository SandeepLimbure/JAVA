package Java_Programs_100;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = scan.nextInt();
        int reverse = 0;
        while(num!=0){
            reverse = reverse*10;
            reverse = reverse + num%10;
            num = num/10;
        }
        System.out.println("reverse of entered number is :- "+reverse);
    }
}
