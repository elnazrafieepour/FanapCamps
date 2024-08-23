package FanapCamps.TransportVehicle;

import static FanapCamps.TransportVehicle.AirPort.parkAirplane;
import static FanapCamps.TransportVehicle.AirPort.parkChopper;

public class Main {
    public static void main(String[] args) {
        /*
        //AirPort1:
        Parking parking1= new Parking();
        AirPlan airplane1= new AirPlan("Tupolev", FUEL.DiESEL, STATUS.ON_TIME);
        Chopper chopper1= new Chopper("Brand1", FUEL.WHITEGAS, STATUS.ONBOARDING);
        AirPort airport1= new AirPort(chopper1, airplane1, parking1);

        System.out.println(parkAirplane(airplane1));
        //System.out.println(airport1.getAirPlanCapacity());
        System.out.println(parkChopper(chopper1));
        //System.out.println(airport1.getChopperCapacity());



        AirPlan airplane2= new AirPlan("Tupolev2", FUEL.DiESEL, STATUS.ON_TIME);
        Chopper chopper2= new Chopper("Brand2", FUEL.WHITEGAS, STATUS.ON_TIME);
        AirPlan airplane3= new AirPlan("Tupolev3", FUEL.WHITEGAS, STATUS.DELAYED);
        Chopper chopper3= new Chopper("Brand3", FUEL.GAS, STATUS.DELAYED);
        AirPlan airplane4= new AirPlan("Tupolev4", FUEL.GAS, STATUS.DELAYED);
        Chopper chopper4= new Chopper("Brand4", FUEL.GAS, STATUS.ONBOARDING);
        AirPlan airplane5= new AirPlan("Tupolev5", FUEL.DiESEL, STATUS.ONBOARDING);
        Chopper chopper5= new Chopper("Brand5", FUEL.DiESEL, STATUS.DELAYED);
        AirPlan airplane6= new AirPlan("Tupolev6", FUEL.DiESEL, STATUS.ONBOARDING);
        Chopper chopper6= new Chopper("Brand6", FUEL.DiESEL, STATUS.DELAYED);
        AirPlan airplane7= new AirPlan("Tupolev7", FUEL.DiESEL, STATUS.DELAYED);
        Chopper chopper7= new Chopper("Brand7", FUEL.GAS, STATUS.ONBOARDING);
        AirPlan airplane8= new AirPlan("Tupolev8", FUEL.GAS, STATUS.ON_TIME);
        Chopper chopper8= new Chopper("Brand8", FUEL.WHITEGAS, STATUS.ONBOARDING);
        AirPlan airplane9= new AirPlan("Tupolev9", FUEL.WHITEGAS, STATUS.ON_TIME);
        Chopper chopper9= new Chopper("Brand9", FUEL.WHITEGAS, STATUS.ONBOARDING);
        AirPlan airplane10= new AirPlan("Tupolev10", FUEL.DiESEL, STATUS.ON_TIME);
        Chopper chopper10= new Chopper("Brand10", FUEL.GAS, STATUS.ONBOARDING);

        System.out.println(parkAirplane(airplane2));
        System.out.println(parkChopper(chopper2));

        System.out.println(parkAirplane(airplane3));
        System.out.println(parkChopper(chopper3));

        System.out.println(parkAirplane(airplane4));
        System.out.println(parkChopper(chopper4));

        System.out.println(parkAirplane(airplane5));
        System.out.println(parkChopper(chopper5));

        System.out.println(parkAirplane(airplane6));
        System.out.println(parkChopper(chopper6));

        System.out.println(parkAirplane(airplane7));
        System.out.println(parkChopper(chopper7));

        System.out.println(parkAirplane(airplane8));
        System.out.println(parkChopper(chopper8));

        System.out.println(parkAirplane(airplane9));
        System.out.println(parkChopper(chopper9));

        System.out.println(parkAirplane(airplane10));
        System.out.println(parkChopper(chopper10));
         */

        //AirPort2:
        AirPort airport2= new AirPort(new Chopper("BranCh1", FUEL.GAS, STATUS.DELAYED), new AirPlan("Topoli", FUEL.DiESEL, STATUS.ON_TIME), new Parking());
        System.out.println(parkAirplane(airport2.airPlan));
        //System.out.println(airport2.getAirPlanCapacity());
        System.out.println(parkChopper(airport2.chopper));
        //System.out.println(airport2.getChopperCapacity());

    }
}
