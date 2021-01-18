public class Flight {
    final private int flight;
    final private String airLine;
    final private int totalCapacity;
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
        return totalCapacity >= numOfSeatsBooked;
    }
    public void updateBookedSeats(int numOfSeatsNeeded) {
        numOfSeatsBooked = numOfSeatsBooked + numOfSeatsNeeded;
    }
}
