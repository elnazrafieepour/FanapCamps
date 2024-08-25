package FanapCamps.airtrip;

import java.util.Date;

public class AirTrip {
    private String destination;
    private String flightNumber;
    private Date departureTime;
    private String status;//----delayed, on time, boarding, departed

    public AirTrip(String destination, String flightNumber, Date departureTime, String status) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.status = status;
    }

    public void announceFlightStatus() {
        if (this.status.equals("delayed")) {
            System.out.println("flight status is : " + this.status + ". Delayed time: " + calculateDiffTimes());
        } else {
            System.out.println("flight status is : " + this.status);
        }
    }

    private String calculateDiffTimes() {
        long flightTimeInMillis = this.departureTime.getTime();
        long currentTimeInMillis = new Date().getTime();
        long diffTimeInMillis = currentTimeInMillis - flightTimeInMillis;

        long seconds = diffTimeInMillis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        minutes = minutes % 60;

        return hours + ":" + minutes;
    }


}
