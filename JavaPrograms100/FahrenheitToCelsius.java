package Java_Programs_100;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temparature in Fahrenheit :- ");
        double f = sc.nextDouble();
        double c = (f - 32)*5/9;
        System.out.println("The temparature in degree C is "+c);
    }
}
