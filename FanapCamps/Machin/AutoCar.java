package FanapCamps.Machin;

public class AutoCar extends Car {
    //properties:
    private boolean gearBoxCVT;

    public AutoCar(boolean gearBoxCVT, String type, long model, boolean auto) {
        super(type, model, auto);
        this.gearBoxCVT = gearBoxCVT;
    }

    //methode:
    public void autoDriving() {
        System.out.println("auto driving by auto gearbox!");
    }

    //getter gearBox:
    public boolean isGearBoxCVT() {
        return gearBoxCVT;
    }

    //constructor:
    public void AutoCar(boolean gearBoxCVT) {
        this.gearBoxCVT = gearBoxCVT;
    }

}
