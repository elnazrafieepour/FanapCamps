import java.util.Scanner;

public class Session {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("title1", "author1");
        Book book2 = new Book("title2", "author2", 120, "Press2", "releaseDate2");

        book.print();
        book1.print();
        book2.print();


}
}
