package FanapCamps.TransportVehicle;

public abstract class Vehicle {
    private String Brand;
    private FUEL fuel;

    public Vehicle(String brand, FUEL fuel) {
    }

    public abstract void Move();

    public abstract void Start();

}
