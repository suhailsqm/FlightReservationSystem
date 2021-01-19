
public class TouristTicket extends  Ticket{

    private String hotelAddress;
    private String[] touristLocations;

    TouristTicket(String departureLocation,
                  String destinationLocation,
                  Flight flight,
                  String dateTimeOfDeparture,
                  String dateTimeOfArrival,
                  Passenger passenger,
                  int seatNumber,
                  double costPrice,
                  boolean statusCancelled,
                  String hotelAddress,
                  String[] touristLocations) {
        super(departureLocation,
                destinationLocation,
                flight,
                dateTimeOfDeparture,
                dateTimeOfArrival,
                passenger,
                seatNumber,
                costPrice,
                statusCancelled);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
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
    public String[] getTouristLocations() {
        return touristLocations;
    }
}
