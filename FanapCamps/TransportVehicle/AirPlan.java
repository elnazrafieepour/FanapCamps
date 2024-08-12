package FanapCamps.TransportVehicle;

public class AirPlan extends Vehicle implements Fly {
    STATUS Status;

    public AirPlan(String brand, FUEL fuel, STATUS Status) {
        super(brand, fuel);
        this.Status=Status;
    }

    @Override
    public void Move() {
        System.out.println("the AirPlan is Moving...");
    };

    @Override
    public void Start() {
        System.out.println("the AirPlan is Starting...");
    };

    @Override
    public void fly() {
        System.out.println("the AirPlan is Starting...");
    };

}
