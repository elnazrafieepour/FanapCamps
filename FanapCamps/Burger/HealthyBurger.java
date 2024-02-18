package FanapCamps.Burger;

//import sun.java2d.pipe.SpanShapeRenderer;

public class HealthyBurger extends SimpleBurger{
    private String healthyExtra1;
    private double healthyExtra1Price;
    private double healthyBurgerPrice;
    private String healthyExtra2;
    private double healthyExtra2Price;
    public HealthyBurger(String meat, double basePrice){
        super("Healthy Burger", "Joe Bread", "meat", 1100);
    }
    public HealthyBurger(){
        super("Healthy Burger", "Joe Bread", "meat", 1100);
    }
    void AdditionHealthy1(String extraAd1, double addition1Price) {
        this.healthyExtra1 = extraAd1;
        this.healthyExtra1Price = addition1Price;
        System.out.println(" Add1 is : " + extraAd1 + " and its Price is: " + addition1Price);
    }
    void AdditionHealthy2(String extraAd2, double addition2Price) {
        this.healthyExtra2 = extraAd2;
        this.healthyExtra2Price = addition2Price;
        System.out.println(" Add2 is : " + extraAd2 + " and its Price is: " + addition2Price);
    }

    public double HealthyBurgerize() {
        super.hambergergrize();
        System.out.println("the Price of your Ham is: " + healthyBurgerPrice + " with gradients of: " + this.getBreadType() + this.getMeat());
        if (this.healthyExtra1 != null) {
            finalPrice += healthyExtra1Price;
        }
        if (this.healthyExtra2 != null) {
            finalPrice += finalPrice + this.healthyExtra1Price+ this.healthyExtra2Price;
        }
        return this.finalPrice;
    }
    @Override
    public double getPrice(){
        return finalPrice;
    }
    @Override
    public String getAdditions(){
        return super.getAdditions() + healthyExtra1 + healthyExtra2;
    }
}
