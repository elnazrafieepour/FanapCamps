package FanapCamps.Resturant;

public class DLuxHamber implements Hamberger, ChipsNooshidani{
    private int priceMeat;
    private int priceBread;

    DLuxHamber(){
        priceMeat= 1000;
        int priceBread= 1000;

    }

    public int pricing(int priceBread, int priceMeat, int Chips, int Nooshidani){
        return this.priceBread+ this.priceMeat+ChipsNooshidani.nooshidani + ChipsNooshidani.chips;
    }
}
