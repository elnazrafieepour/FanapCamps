package FanapCamps.Resturant;

import static FanapCamps.Resturant.ChipsNooshidani.*;

public class Main {

    public static void main(String[] args){
        DLuxHamber dLuxHamber= new DLuxHamber( "bread1", "meat1");
        DLuxHamber dLuxHamber2= new DLuxHamber( "bread1", "meat1", "chips1");
        SimpleHamber simpleHamber= new SimpleHamber();
        HealthHamber healthHamber=new HealthHamber();

        System.out.println(dLuxHamber.pricing("bread", "meat","chips & nooshidani"));
        System.out.println(dLuxHamber.pricing("bread", "meat"));
        System.out.println(dLuxHamber2.pricing("bread", "meat","chips & nooshidani"));
        System.out.println(dLuxHamber2.pricing("bread", "meat"));
    }
}
