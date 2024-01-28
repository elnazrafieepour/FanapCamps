package FanapCamps.Machin;

public class Vehicle {
    private String type;

    public void driving() {
        System.out.println("every vehicle can driving...");
    }

    //getter & Setter:
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Constructor:
    public void Vehicle(String type) {
        this.type = type;
    }
}
