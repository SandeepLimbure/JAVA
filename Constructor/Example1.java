package Constructor;

public class Example1 {
    public static class cat{
        private String name;
        private int age;
        cat(){
            this.name = "Unknown";
            this.age = 0;
        }
    }

    public static void main(String[] args) {
        cat mycat = new cat();
        System.out.println(mycat.name);
        System.out.println(mycat.age);
    }
}
