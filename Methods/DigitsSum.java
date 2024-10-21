package Methods;

public class DigitsSum {
    public static void main(String[] args) {
        int num = 25;
        int res = sum(num);
        System.out.println(res);
    }
    public static int sum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n=n/10;
        }
        return sum;
    }
}
