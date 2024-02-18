package FanapCamps.Burger;

import java.io.Serializable;

public class SimpleBurger implements BaseBurger, Serializable {
    private String breadType;
    private String meat;
    private String name;
    private double basePrice;
    protected double finalPrice;
    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;

    //Constructor:
    public SimpleBurger(String name, String breadType, String meat, double basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public SimpleBurger() {
        this("generally Burger", "White Bread", "Meat", 100);
    }

    //getters:
    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    void Addition1(String extraAd1, double addition1Price) {
        this.addition1 = extraAd1;
        this.addition1Price = addition1Price;
        System.out.println(" Add1 is : " + extraAd1 + " and its Price is: " + addition1Price);
    }
    void Addition2(String extraAd2, double addition2Price) {
        this.addition2 = extraAd2;
        this.addition2Price = addition2Price;
        System.out.println(" Add2 is : " + extraAd2 + " and its Price is: " + addition2Price);
    }
    void Addition3(String extraAd3, double addition3Price) {
        this.addition3 = extraAd3;
        this.addition3Price = addition3Price;
        System.out.println(" Add3 is : " + extraAd3 + " and its Price is: " + addition3Price);
    }
    void Addition4(String extraAd4, double addition4Price) {
        this.addition4 = extraAd4;
        this.addition4Price = addition4Price;
        System.out.println(" Add4 is : " + extraAd4 + " and its Price is: " + addition4Price);
    }
    public double hambergergrize() {
        System.out.println("the Price of your Ham is: " + basePrice + " with gradients of: " + this.breadType + this.meat);
        if (addition1 != null) {
            finalPrice = basePrice + addition1Price;
        }
        if (addition2 != null) {
            finalPrice = basePrice + addition1Price + addition2Price;
        }
        if (addition3 != null) {
            finalPrice = basePrice + addition1Price + addition2Price + addition3Price;
        }
        if (addition4 != null) {
            finalPrice = basePrice + addition1Price + addition2Price + addition3Price + addition4Price;
        }
return finalPrice;
    }
    @Override
    public double getPrice(){
        return finalPrice;
}
@Override
    public String getAdditions(){
        return addition1 + addition2+addition3+addition4;
    }
            }
