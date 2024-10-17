package Constructor;

public class Example8 {
    public static class Point{
        private int x;
        private int y;
        Point(int a,int b){
            this.x=a;
            this.y=b;
        }
        Point(double a,double b){
            this.x=(int)a;
            this.y=(int)b;
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(5,5);
        System.out.println("new point :- "+(p1.x+","+p1.y));
        Point p2 = new Point(4.5,4.5);
        System.out.println("new point :- "+(p2.x+","+p2.y));
    }
}
