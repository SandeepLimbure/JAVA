package Methods;

public class Triangle {
    public static void main(String[] args) {
         double a = 10;
         double b = 15;
         double c = 20;
         double res = area(a,b,c);
         boolean res1  = is_Valid(a,b,c);
        System.out.println(res1);
        System.out.println(res);
    }

    public static boolean is_Valid(double side1, double side2, double side3) {
        if( side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side1 + side3 > side2) return true;
        else return false;
    }
    public static double area(double a ,double b,double c){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
