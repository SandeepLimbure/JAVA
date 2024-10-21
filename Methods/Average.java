package Methods;

public class Average {
    public static void main(String[] args) {
       int a = 25;
       int b = 45;
       int c = 65;
       float res = average(a,b,c);
        System.out.println("the average value is :- "+ res);
    }
    public static float average(int a,int b,int c){
        float avg = (a+b+c)/3;
        return avg;
    }
}
