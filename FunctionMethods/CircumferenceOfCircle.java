package FunctionsMethods;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle :- ");
        int r = sc.nextInt();
        Circumference(r);
    }
    public static void Circumference(int radius){
        float circum = (float) (2*Math.PI*radius);
        System.out.println(circum);
    }
}
