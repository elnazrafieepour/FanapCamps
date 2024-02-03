package FanapCamps.Machin;

public class Main {
    public static void main(String[] args){
        Car newCar= new Car("Savari", 1402, true);
        Vehicle newVehicle= new Vehicle("Sangin");

        //Practice 7-5 Liskov Substitution SOLID OOP:
        newCar.sokhtZadan();
        newCar.driving();
        newVehicle.sokhtZadan();
        newVehicle.driving();
    }
}
