package FanapCamps.Machin;

public class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type=type;
    }

    public void sokhtZadan() {
        System.out.println("every vehicle need Sookht...");
    }

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
