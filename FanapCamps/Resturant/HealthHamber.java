package FanapCamps.Resturant;

public class HealthHamber extends Afzoodani implements Hamberger{
    private int joBread;
    private int priceMeat;
    public int pricing(){
        return priceMeat+ joBread;
    }

    HealthHamber(){
         joBread= 4500;
         priceMeat= 1000;
    }
}
