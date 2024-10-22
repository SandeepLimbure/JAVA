package FunctionsMethods;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number :- ");
       int a = sc.nextInt();
       Sum(a);
    }
    public static void Sum(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
