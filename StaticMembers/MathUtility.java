package StaticMembers;

public class MathUtility {
    public static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int sum = MathUtility.add(6,6);
        System.out.println(sum);
    }
}
