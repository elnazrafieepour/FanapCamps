package FanapCamps.TransportVehicle;

public abstract class Vehicle {
    private String Brand;
    private FUEL fuel;

    public abstract void Move();

    public abstract void Start();

    //Constructor:
    public Vehicle(String brand, FUEL fuel) {
        this.Brand = brand;
        this.fuel = fuel;
    }

    //Getters:
    public String getBrand() {
        return Brand;
    }

    public FUEL getFuel() {
        return fuel;
    }
}
