package Java_Programs_100;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        int passingMarks = 40;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the obtained marks :- ");
        int obtainedMarks = sc.nextInt();
        if(obtainedMarks > passingMarks){
            if(obtainedMarks>85){
                System.out.println("A grade");
            } else if (obtainedMarks>70 && obtainedMarks<=85) {
                System.out.println("B grade");
            } else if (obtainedMarks>55 &&  obtainedMarks<=70) {
                System.out.println("C grade");
            }else{
                System.out.println("D grade");
            }
        }else{
            System.out.println("Failed");
        }
    }
}
