package FanapCamps.Order;

public class Order {
    private int price;
    private String description;

    //getter and setter:
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    //Constructor:
    public void Order(int price, String description) {
        this.description = description;
        this.price = price;
    }
}
