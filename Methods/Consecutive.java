package Methods;

public class Consecutive {
    public static void main(String[] args) {
       int a = 15;
       int b = 16;
       int c = 17;
       boolean res = cons(a,b,c);
        System.out.println(res);
    }
    public static boolean cons(int a,int b,int c){
        if(b-a==1 && c-b==1){
            return true;
        }
        else{
            return false;
        }
    }
}
