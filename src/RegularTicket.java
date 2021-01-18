import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class RegularTicket {
    String pnr;
    String departureLocation;
    String destinationLocation;
    Flight flight;

    String dateTimeOfDeparture;
    String dateTimeOfArrival;
    Passenger passenger;
    int seatNumber;
    double costPrice;
    boolean statusCancelled;
    String specialService;

    RegularTicket(String pnr,
            String departureLocation,
            String destinationLocation,
            Flight flight,
            String dateTimeOfDeparture,
            String dateTimeOfArrival,
            Passenger passenger,
            int seatNumber,
            double costPrice,
            boolean statusCancelled,
            String specialService) {
        this.pnr = pnr;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flight = flight;
        this.dateTimeOfDeparture = dateTimeOfDeparture;
        this.dateTimeOfArrival = dateTimeOfArrival;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.costPrice = costPrice;
        this.statusCancelled = statusCancelled;
        this.specialService = specialService;
    }
    public boolean checkStatusCancelled() {
          return statusCancelled;
    }
    public void setStatusCancelled() {
        statusCancelled = true;
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
    public String getSpecialService() {
        return null;
    }
    public void updateSpecialService(String specialService) {
        this.specialService = specialService;
    }



}
