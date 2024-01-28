package FanapCamps.Printer;

public class Main {
    public static void main(String[] args){
        Printer newPrinter1= new Printer(40, false);
        System.out.println("Initial pageCount is: " + newPrinter1.getPagePrinted());
        newPrinter1.printPageCount(15);
        System.out.println("Second PrintedPages1 is: " + newPrinter1.getPagePrinted());

        Printer newPrinter2= new Printer(40, true);
        System.out.println("Initial pageCount is: " + newPrinter2.getPagePrinted());
        newPrinter2.printPageCount(15);
        System.out.println("Second PrintedPages2 is: " + newPrinter2.getPagePrinted());
    }
}
