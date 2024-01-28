import FanapCamps.Book.Book;
import FanapCamps.Book.EBook;

public class Session {


    public static void main(String[] args) {
        Book book = new Book();
      //  FanapCamps.Book.Book book1 = new FanapCamps.Book.Book("title1", "author1");
        Book book2 = new Book("title2", "author2", 120, "Press2", "releaseDate2");
        EBook book3 = new EBook();

        book.print();
     //   book1.print();
        book2.print();
       // FanapCamps.Book.EBook.print();


    }
}
