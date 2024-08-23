package FanapCamps.TransportVehicle;

public class Parking {
    static long Capacity= 10;
    public static long park(Machine machine){
        System.out.println("The Machine in the Parking is park...");
        return Capacity--;
    }

    //Getters:
    public static long getCapacity() {
        return Capacity;
    }
}
