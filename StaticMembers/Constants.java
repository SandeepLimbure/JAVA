package StaticMembers;

public class Constants {
    private static final double pi = 3.14159;
    public static double calculateArea(int radius){
        return pi*radius*radius;
    }

    public static void main(String[] args) {
        double area = calculateArea(6);
        System.out.println(area);
    }
}
