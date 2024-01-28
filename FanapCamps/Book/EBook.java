package FanapCamps.Book;

public class EBook extends Book {
    private String UpdatedDate;

    public void convertType(String type) {
        this.type = type;
    }

    public EBook(){
        this.type="ePub";
        this.title="eTitle";
        this.UpdatedDate="Today";
        this.price= (int) ((0.80)*price);
    }

    //public void discountPriceForElectronic(int price){
    //    this.price= (int) ((0.80)*price);

    //}

    @Override
    public void print() {
        System.out.println("title is: " + title + " type is: " + type + " Last UpdatedDate is: " + UpdatedDate + " price is: " + price);
    }

    public static void main(String[] args){
        EBook eBook1= new EBook();
        eBook1.print();
    }
}
