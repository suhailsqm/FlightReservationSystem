public class Flight {
    final private int flight;
    final private String airLine;
    final private int totalCapacity;
    private int numOfSeatsBooked;
    private String departureLocation;
    private String arrivalLocation;

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    private String departureTime;

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    private String arrivalTime;

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }



    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }



    Flight(int flight,
           String airLine,
           int totalCapacity,
           int numOfSeatsBooked,
           String departureLocation,
           String arrivalLocation,
           String departureTime,
           String arrivalTime) {
        this.flight = flight;
        this.airLine = airLine;
        this.totalCapacity = totalCapacity;
        this.numOfSeatsBooked += numOfSeatsBooked;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
    public String getFlightDetails() {
        return flight+ "@" +airLine+"@"+numOfSeatsBooked;
    }
    public boolean checkAvailability() {
        return totalCapacity >= numOfSeatsBooked;
    }
    public void updateBookedSeats(int numOfSeatsNeeded) {
        numOfSeatsBooked = numOfSeatsBooked + numOfSeatsNeeded;
    }
    public int getNumOfSeatsAvailable() {
        return this.totalCapacity - this.numOfSeatsBooked;
    }
    public int getSeatNumber() {
        int seatNumber = this.numOfSeatsBooked;
        updateBookedSeats(1);
        return seatNumber;
    }

}
