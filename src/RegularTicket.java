
public class RegularTicket extends  Ticket{

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
        super(pnr,departureLocation,destinationLocation,flight,dateTimeOfDeparture,dateTimeOfArrival,
        passenger,seatNumber,costPrice,statusCancelled);
        this.specialService = specialService;
    }

    public String getSpecialService() {
        return null;
    }
    public void updateSpecialService(String specialService) {
        this.specialService = specialService;
    }

}
