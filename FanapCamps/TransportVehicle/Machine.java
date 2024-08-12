package FanapCamps.TransportVehicle;

public class Machine extends Vehicle {
    BODY Body;

    public Machine(String brand, FUEL fuel, BODY Body) {
        super(brand, fuel);
        this.Body=Body;
    };

    @Override
    public void Move() {
        System.out.println("the Machine is Moving...");
    };

    @Override
    public void Start() {
        System.out.println("the Machine is Starting...");
    };

}
