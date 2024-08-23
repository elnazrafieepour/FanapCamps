package FanapCamps.TransportVehicle;

public class Chopper extends Vehicle implements Fly{
    STATUS Status;

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

    public void VerticalFly() {
        System.out.println("the AirPlan can Vertical Fly...");
    };

    //Constructor:
    public Chopper(String Brand, FUEL fuel, STATUS Status) {
        super(Brand, fuel);
        this.Status = Status;
    };

    //Getters:
    public STATUS getStatus() {
        return Status;
    }
}
