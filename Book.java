import java.util.Objects;
import java.util.Scanner;

public class Book {
    //Properties:
    public String title;
    public String author;
    public Integer pageCount;
    public String press;
    public String releaseDate;
    public static Integer saleCount;
    public Integer price=2000;
    public String type;

    //DefaultConstructor:
    public Book() {
        this.title = "TitleDefaultConstructor";
        this.author = "AuthorDefaultConstructor";
        this.pageCount = 100;
        this.press = "PressDefaultConstructor";
        this.releaseDate = "ReleaseDateDefaultConstructor";
        this.type="Physical";
    }

    //ParameterizedConstructors:
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price=price;
    }

    public Book(String title, String author, Integer pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public Book(String title, String author, Integer pageCount, String press, String releaseDate) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.press = press;
        this.releaseDate = releaseDate;
    }


    //Methode: Print Information of Book:
    public void print() {
        System.out.println("the title of your Book is: " + title + " and the author of Book is: " + author + " and the press of Book is: " + press + " and the page count of Book is: " + pageCount + " and the release Date of Book is: " + releaseDate);
    }

    //Methode for Ckecking equality Input Title and Title of this Book:
    public void checkTitle() {
        Scanner input = new Scanner(System.in);
        String titleInput = input.next();
        input.close();
        if (Objects.equals(this.title, titleInput))
            System.out.println("Find Book!");
        else
            System.out.println("No Book");
    }

    //Static Block:
    static {
        saleCount = 0;
        System.out.println(saleCount);

    }

    public void increaseSaleCount(){
        saleCount++;
        System.out.println("saleCount is: " + saleCount);

    }
    public void printStaticVar(){
        System.out.println("saleCount is: " + saleCount);

    }

    public static void main(String[] args) {
        Book book = new Book("Math1", "Ross", 1000);
        book.checkTitle();

        Book book1 = new Book();
        Book book2 = new Book("eli", "test", 1000);
        book1.increaseSaleCount();
        book2.printStaticVar();

    }

}
