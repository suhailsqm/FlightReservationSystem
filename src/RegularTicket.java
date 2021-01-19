
public class RegularTicket extends  Ticket{

    private String specialService;

    RegularTicket(String departureLocation,
            String destinationLocation,
            Flight flight,
            String dateTimeOfDeparture,
            String dateTimeOfArrival,
            Passenger passenger,
            int seatNumber,
            double costPrice,
            boolean statusCancelled,
            String specialService) {
        super(departureLocation,destinationLocation,flight,dateTimeOfDeparture,dateTimeOfArrival,
        passenger,seatNumber,costPrice,statusCancelled);
        this.specialService = specialService;
    }

    public String getSpecialService() {
        return this.specialService;
    }
    public void updateSpecialService(String specialService) {
        this.specialService = specialService;
    }

}
