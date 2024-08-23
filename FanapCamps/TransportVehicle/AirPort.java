package FanapCamps.TransportVehicle;

public class AirPort {
    Chopper chopper;
    AirPlan airPlan;
    Parking parking;

    static long ChopperCapacity = 8;
    static long AirPlanCapacity = 4;

    public static String parkChopper(Chopper chopper) {
        if (ChopperCapacity == 0) {
            System.out.println("The Airport has NO Capacity for Chopper Park...");
        } else {
            System.out.println("The Chopper in the AirPort is park...");
            ChopperCapacity--;
        }
        return "The Capacity Chopper of AirPort is: " + ChopperCapacity;
    }

    public static String parkAirplane(AirPlan airPlan) {
        if (AirPlanCapacity == 0) {
            System.out.println("The Airport has NO Capacity for AirPlan Park...");
        } else {
            System.out.println("The AirPlan in the AirPort is park...");
            AirPlanCapacity--;
        }
        return "The Capacity AirPlan of AirPort is: " + AirPlanCapacity;
    }

    //Constructor:
    public AirPort(Chopper chopper, AirPlan airPlan, Parking parking) {
        this.chopper = chopper;
        this.airPlan = airPlan;
        this.parking = parking;
    }

    //Getters:
    public Chopper getChopper() {
        return chopper;
    }

    public AirPlan getAirPlan() {
        return airPlan;
    }

    public Parking getParking() {
        return parking;
    }

    public static long getChopperCapacity() {
        return ChopperCapacity;
    }

    public static long getAirPlanCapacity() {
        return AirPlanCapacity;
    }
}
