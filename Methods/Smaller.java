package Methods;

public class Smaller {
    public static void main(String[] args) {
        int a = 25;
        int b = 37;
        int c = 29;
        int res = smaller(a,b,c);
        System.out.println("the smallest value is :- "+ res);
    }
    public static int smaller(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }else{
            return c;
        }
    }
}
