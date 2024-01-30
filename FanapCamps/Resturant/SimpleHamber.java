package FanapCamps.Resturant;

public class SimpleHamber extends Afzoodani implements Hamberger{
    private int priceMeat = 1000;
    private int priceBread = 1000;

    public int pricing(int priceMeat, int priceBread) {
        return this.priceBread + this.priceMeat;
    }

}
