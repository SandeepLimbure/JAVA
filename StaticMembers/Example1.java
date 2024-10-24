package StaticMembers;

public class Example1 {
    public static class Counter{
        private static int count = 0;
        Counter(){
            count++;
        }
        public static int getCount(){
            return count;
        }
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter C2 = new Counter();
        System.out.println(Counter.getCount());
    }
}
