package Constructor;

public class Example3 {
    public static class Book{
        private String title;
        private String author;
        private int price;
        Book(){
            this.title="Wings Of Fire";
            this.author="Dr. A.P.J Abdul Kalam";
            this.price = 150;
        }
        Book(String t,String a){
            this.title=t;
            this.author=a;
        }
        Book(String t,String a,int p){
            this.title=t;
            this.author=a;
            this.price=p;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.title+"\n"+book1.author+"\n"+book1.price);
        Book book2 = new Book("WINGS OF FIRE","Dr. A.P.J Abdul Kalam");
        System.out.println("\nParameterized Constructor 1 :- ");
        System.out.println(book2.title+"\n"+book2.author);
        System.out.println("\nParameterized Constructor 2 :- ");
        Book book3 = new Book("Wings Of Fire","Dr. A.P.J Abdul Kalam",150);
        System.out.println(book3.title+"\n"+book3.author+"\n"+book3.price);
    }
}
