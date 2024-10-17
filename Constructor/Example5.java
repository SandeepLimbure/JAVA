package Constructor;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static class Book{
        private String title;
        private String author;
        private String ISBN;
        Book(String t,String a,String i){
            this.title=t;
            this.author=a;
            this.ISBN=i;
        }
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getISBN() {
            return ISBN;
        }

        public static class Library {
            private List<Book> books = new ArrayList<>();

            public void addBook(Book book) {
                books.add(book);
            }

            public void removeBook(Book book) {
                books.remove(book);
            }

            public List<Book> getBooks() {
                return books;
            }
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("A","B","C");
        Book b2 = new Book("D","E","F");
        System.out.println(b1.author+"\n"+b1.title+"\n"+b1.ISBN);
        System.out.println(b2.author+"\n"+b2.title+"\n"+b2.ISBN);
        System.out.println("====================");
        Book.Library L1 = new Book.Library();
        for (Book book : L1.books) {
            System.out.println(book);
        }
        L1.addBook(new Book("S","A","N"));
        L1.removeBook(new Book("S","A","N"));

    }
}
