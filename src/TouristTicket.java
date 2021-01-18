import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TouristTicket {
    String pnr;
    String departureLocation;
    String destinationLocation;
    Flight flight;

    String dateTimeOfDeparture;
    String dateTImeOfArrival;
    Passenger passenger;
    int seatNumber;
    double costPrice;
    boolean statusCancelled;
    String hotelAddress;
    String[] touristLocations;

    TouristTicket(String pnr,
                  String departureLocation,
                  String destinationLocation,
                  Flight flight,
                  String dateTimeOfDeparture,
                  String dateTImeOfArrival,
                  Passenger passenger,
                  int seatNumber,
                  double costPrice,
                  boolean statusCancelled,
                  String hotelAddress,
                  String[] touristLocations) {
        this.pnr = pnr;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flight = flight;
        this.dateTimeOfDeparture = dateTimeOfDeparture;
        this.dateTImeOfArrival = dateTImeOfArrival;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.costPrice = costPrice;
        this.statusCancelled = statusCancelled;
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }
    public boolean checkStatusCancelled() {
        return statusCancelled;
    }
    public void setStatusCancelled() {
        statusCancelled = true;
    }
    public String getFlightDuration() {

        String dateArrival  = dateTImeOfArrival;
        String dateDeparture = dateTimeOfDeparture;
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(dateDeparture);
            d2 = format.parse(dateArrival);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000);

        //Time durationDiff = new Time(diff);
        //durationDiff.toString();
        return  diffHours+" "+diffMinutes+" "+diffSeconds;
    }
    public String getHotelAddress() {
        return this.hotelAddress;
    }
    public void setHotelAddress(String address) {
        this.hotelAddress = address;
    }
    public void addTouristLocation(String touristLocation) {
        int i = 0;
        for(; i < 5; i++) {
            if(touristLocations[i] == null) {
                touristLocations[i] = touristLocation;
            }
        }
        if(i==5) {
            System.out.println("No new tourist Locations can be added. Limit is 5!");
        }
    }
    public void removeTouristLocation(String touristLocation) {
        int i = 0;
        for(; i < 5; i++) {
            if(touristLocations[i] == touristLocation) {
                touristLocations[i] = null;
            }
        }
    }

}
