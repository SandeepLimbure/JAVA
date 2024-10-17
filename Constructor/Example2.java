package Constructor;

public class Example2 {
    public static class Dog{
        private String name;
        private String color;
        Dog(String n,String c) {
            this.name = n;
            this.color = c;
        }
    }

    public static void main(String[] args) {
        Dog mydog = new Dog("French Bulldog","White");
        System.out.println(mydog.name);
        System.out.println(mydog.color);
    }
}
