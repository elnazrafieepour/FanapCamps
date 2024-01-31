package FanapCamps.Resturant;

public class DLuxHamber implements Hamberger, ChipsNooshidani {
    public String bread1 = "bread";
    public String meat1 = "meat";
    public String chips1 = "chips";
    private final int priceMeat;
    private final int priceBread;


    DLuxHamber(String bread1, String meat1) {
        this.priceBread = 1000;
        this.priceMeat = 1100;
        this.meat1 = meat1;
        this.bread1 = bread1;
    }

    DLuxHamber(String bread1, String meat1, String chips1) {
        this.priceBread = 1000;
        this.priceMeat = 1100;
        this.meat1 = meat1;
        this.bread1 = bread1;
    }

    public int pricing(String bread1, String meat1, String chips1) {
        return this.priceBread + this.priceMeat + ChipsNooshidani.nooshidani + ChipsNooshidani.chips;
    }

    public int pricing(String bread1, String meat1) {
        return this.priceBread + this.priceMeat;
    }
}
