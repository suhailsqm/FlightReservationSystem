import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Time;

public abstract class Ticket {
    private String pnr;
    private String departureLocation;
    private String destinationLocation;
    private Flight flight;

    private String dateTimeOfDeparture;
    private String dateTimeOfArrival;
    private Passenger passenger;
    private int seatNumber;
    private double costPrice;
    private boolean statusCancelled;
    private static int pnrCounter;
    static  {
        pnrCounter = 0;
    }
    Ticket(String departureLocation,
           String destinationLocation,
           Flight flight,
           String dateTimeOfDeparture,
           String dateTimeOfArrival,
           Passenger passenger,
           int seatNumber,
           double costPrice,
           boolean statusCancelled) {
        setPnr();
        this.pnr = getPnr();
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flight = flight;
        this.dateTimeOfDeparture = dateTimeOfDeparture;
        this.dateTimeOfArrival = dateTimeOfArrival;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.costPrice = costPrice;
        this.statusCancelled = statusCancelled;
    }
    public boolean checkStatusCancelled() {
        return statusCancelled;
    }
    public void setStatusCancelled() {
        statusCancelled = true;
    }
    public String getPnr() {
        return pnr;
    }
    public void setPnr() {
        pnrCounter++;
        this.pnr = Integer.toHexString(pnrCounter);
    }

    public String getFlightDuration() {

        String dateArrival  = dateTimeOfArrival;
        String dateDeparture = dateTimeOfDeparture;
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(dateDeparture);
            d2 = format.parse(dateArrival);
            System.out.println(d1.toString());
            System.out.println(d2.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diff = d2.getTime() - d1.getTime();
        long diff2 = diff;
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000);

        System.out.println(diffHours+ " "+diffMinutes+" "+diffSeconds);
        //Time durationDiff = new Time(diff2);

        return diffHours+" "+diffMinutes+" "+diffSeconds;
    }
}
