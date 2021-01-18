public class Flight {
    private int flight;
    private String airLine;
    private int totalCapacity;
    private int numOfSeatsBooked;

    Flight(int flight,String airLine,int totalCapacity, int numOfSeatsBooked) {
        this.flight = flight;
        this.airLine = airLine;
        this.totalCapacity = totalCapacity;
        this.numOfSeatsBooked = numOfSeatsBooked;
    }
    public String getFlightDetails() {
        return flight+ "@" +airLine+"@"+numOfSeatsBooked;
    }
    public boolean checkAvailability() {
        if(totalCapacity >= numOfSeatsBooked) {
            return  true;
        } else
            return false;
    }
    public void updateBookedSeats(int numOfSeatsNeeded) {
        numOfSeatsBooked = numOfSeatsBooked + numOfSeatsNeeded;
    }
}
