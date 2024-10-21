package Methods;

public class MidPoint {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 6;
        boolean res = midpoint(a,b,c);
        System.out.println(res);
    }
    public static boolean midpoint(int a,int b,int c){
        int midpoint = (a+c)/2;
        if(midpoint==b){
            return true;
        }else{
            return false;
        }
    }
}
