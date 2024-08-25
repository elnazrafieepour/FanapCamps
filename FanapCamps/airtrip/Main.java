package FanapCamps.airtrip;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        AirTrip parisFlight = new AirTrip("Paris", "Fr222", new Date(),"delayed");

        parisFlight.announceFlightStatus();
    }
}
