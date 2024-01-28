package FanapCamps.Machin;

public class Car extends Vehicle {
    private int wheelCount;
    private boolean certificate;
    private boolean auto;
    private long model;
    private long kilometer;

    //methodes:
    @Override
    public void driving() {
        System.out.println("the car can driving by motor!");
    }

    public void service(long kilometer) {
        long serviceTime = this.kilometer + 1000;
    }

    //getters and setters:
    public boolean isAuto() {
        return auto;
    }

    public long getModel() {
        return model;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setKilometer(long kilometer) {
        this.kilometer = kilometer;
    }

    public boolean isCertificate() {
        return certificate;
    }

    //Constructors:
    public void Car(int wheelCount, boolean certificate) {
        this.wheelCount = wheelCount;
        this.certificate = certificate;
    }

    public void Car(int wheelCount, boolean certificate, boolean auto) {
        this.wheelCount = wheelCount;
        this.certificate = certificate;
        this.auto = auto;

    }
}
