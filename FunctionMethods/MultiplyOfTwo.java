package FunctionsMethods;

import java.util.Scanner;

public class MultiplyOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :- ");
        int a = sc.nextInt();
        System.out.print("Enter num2 :- ");
        int b = sc.nextInt();
        var mul = Multiply(a,b);
        System.out.println(mul);
//        MultiplyOfTwo scan = new MultiplyOfTwo();
//        scan.Multiply(a,b);                           //void

    }
    public static int Multiply(int a,int b){
        int mul = a*b;
//        System.out.println(mul);
        return mul;
    }
}
