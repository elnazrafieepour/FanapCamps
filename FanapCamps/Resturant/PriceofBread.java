package FanapCamps.Resturant;

public interface PriceofBread implements Price{
    public static int[] breadPrice={1000,2000};
    @Override
    default public int pricing(int breadPrice){
        Price.basePrice += this.breadPrice;
        return Price.basePrice;
    }
}
