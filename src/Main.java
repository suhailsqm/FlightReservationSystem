
public class Main {
    private static Flight[] flights;
    private static Ticket[] tickets;
    private static Passenger[] registeredPassengers;

    static {
        flights = new Flight[100];
        registeredPassengers = new Passenger[1000];
        tickets = new Ticket[10];
    }
    public Flight trackFlightAvailable(String departureLocation,String arrivalLocation) {
        for(Flight f:flights) {
            if(f.getDepartureLocation().equalsIgnoreCase(departureLocation) &&
                f.getArrivalLocation().equalsIgnoreCase(arrivalLocation)) {
                return f;
            }
        }
        return null;
    }

    public static void registerPassenger(Passenger passenger) {
      for(int i = 0; i < 1000 ;i++) {
          if(registeredPassengers[i] == null) {
              registeredPassengers[i] = passenger;
              break;
          }
      }
    }
    public static void unregisterPassenger(Passenger passenger) {
        for(int i = 0;i < 1000;i++) {
            if(registeredPassengers[i] == passenger) {
                registeredPassengers[i] = null;
            }
        }
    }
    public int trackSeatsAvailable(Flight flight) {
        return flight.getNumOfSeatsAvailable();
    }
    public static void registerFlight(Flight flight) {
        for(int i = 0;i < 100 ;i++) {
            if(flights[i] == null) {
                flights[i] = flight;
                break;
            }
        }
    }

    public static void unregisterFlight(Flight f) {
        for(int i = 0;i < 100 ;i++) {
            if(flights[i] == f) {
                flights[i] = null;
                break;
            }
        }
    }

    public static void bookATicket(String departureLocation,
                       String destinationLocation,
                       String departureTime,
                       String arrivalTime,
                       Passenger passenger,
                              Flight flight,
                              double costPrice,
                              boolean isTouristTicket,
                                String specialService,
                              String hotelAddress,
                                String[] touristLocations) {
        if(!isTouristTicket) {
            RegularTicket regularTicket = new RegularTicket(departureLocation,
                        destinationLocation,
                        flight,
                        departureTime,
                        arrivalTime,
                        passenger,
                        flight.getSeatNumber(),
                        costPrice,
                        false,
                        specialService);
                for (int i =0;i < 10;i++) {
                    if(tickets[i] == null) {
                        tickets[i] = regularTicket;
                        break;
                    }
                }

        } else {
            TouristTicket touristTicket = new TouristTicket(departureLocation,
                    destinationLocation,
                    flight,
                    departureTime,
                    arrivalTime,
                    passenger,
                    flight.getSeatNumber(),
                    costPrice,
                    false,
                    hotelAddress,
                    touristLocations);
            for (int i =0;i < 10;i++) {
                if(tickets[i] == null) {
                    tickets[i] = touristTicket;
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        /*
        Address a = new Address("balaji nagar","visakhapatnam","AP");
        System.out.println(a.getAddressDetails());
        a.updateAddressDetails("Ambedkar Nagar@visakhapatnam@AP");
        System.out.println(a.getAddressDetails());
        a.updateAddressDetails("arilova","visakhapatnam","AP");
        System.out.println(a.getAddressDetails());

        Contact c = new Contact("suhail","7075052521","suhailsqm@gmail.com");
        System.out.println(c.getContactDetails());
        c.setContactDetails("shakeel@9704617009@shakeel88taj@gmail.com");
        System.out.println(c.getContactDetails());
        c.setContactDetails("sakeena","9899878799","sakeenassb@gmail.com");
        System.out.println(c.getContactDetails());
*/
        String arrivalTime = "21/01/01 23:23:34";
        String departureTime ="20/12/31 5:23:32";
        for(int i = 0;i <100 ; i++) {
            Flight f = new Flight(87+i, "Air India", 300, 0, "Visakhapatnam",
                    "Hyderabad",departureTime,arrivalTime);
            //flights[i] = f;
            registerFlight(f);
        }

        for(int i = 0; i < 20; i ++) {
            unregisterFlight(flights[i]);
        }

        for(int i = 0;i <10 ; i++) {
            Flight f = new Flight(234+i, "Air India", 300, 0, "Visakhapatnam",
                    "Hyderabad",departureTime,arrivalTime);
            registerFlight(f);
        }
        for(int i = 0; i < 10 ;i++) {
            Passenger p = new Passenger("red"+i,"98776657"+i,
                    i+"asd@gmail.com","gandhi street", "vizag","AP");
            registerPassenger(p);
        }
        for(int i=0;i<10;i++) {
            unregisterPassenger(registeredPassengers[i]);
        }
        bookATicket(flights[0].getDepartureLocation(),
                flights[0].getArrivalLocation(),
                flights[0].getDepartureTime(),
                flights[0].getArrivalTime(),
                registeredPassengers[0],
                flights[0],
                6000,
                false,
                "food drinks",
                null,
                null);

        String[] touristLocations = {"shimla","manali","ooty"};
        bookATicket(flights[1].getDepartureLocation(),
                flights[1].getArrivalLocation(),
                flights[1].getDepartureTime(),
                flights[1].getArrivalTime(),
                registeredPassengers[1],
                flights[1],
                6000,
                true,
                "food drinks",
                "",
                touristLocations);
        //printTicketDetails();
        for(Ticket t: tickets) {
            if(t !=null) {
                System.out.println("ticket :" + t);
                printTicketDetails(t);
            }
        }


/*
        for (Flight f: flights) {
            System.out.println("flight traversed");
            if(f != null) {
                System.out.println(f.getFlightDetails());
                System.out.println(f.checkAvailability());
            }
        }
*/

        /*
        Flight f = new Flight(87,"Air India",300,3,"Visakhapatnam",
                "Hyderabad");
        System.out.println(f.getFlightDetails());
        System.out.println(f.checkAvailability());
        f.updateBookedSeats(300);
        System.out.println(f.checkAvailability());

        Passenger p = new Passenger("red","9877665766",
                                    "asd@gmail.com","gandhi street", "vizag","AP");
        System.out.println("Address :"+p.getAddress());
        System.out.println("Contact :"+p.getContact());
        System.out.println("Id :"+p.getId());
        System.out.println(Passenger.getIdCounter());
        System.out.println(Passenger.getPassengerCount());
        p.setAddress("ads","adads","ad" );
        p.setContact("aps","314324342","s@gmail.com");

        Passenger p1 = new Passenger("blue","9877665766",
                "asd@gmail.com","gandhi street", "vizag","AP");
        System.out.println(p1.getAddress());
        p1.setAddress("lalitha street@visakhapatnam@AP");

        System.out.println(p1.getAddress());
        System.out.println(p1.getContact());
        System.out.println(p1.getId());
        System.out.println(Passenger.getIdCounter());
        System.out.println(Passenger.getPassengerCount());

        String arrivalTime = "21/01/01 23:23:34";
        String departureTime ="20/12/31 5:23:32";
        RegularTicket rt = new RegularTicket("bhubaneshwar",
                "visakhapatnam",f,
                departureTime,arrivalTime,p,213,6000,false,null);
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getFlightDuration());
        rt.setStatusCancelled();
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getSpecialService());
        rt.updateSpecialService(null);
        printTicketDetails(rt);

        String[] touristLocations = {"shimla","manali","ooty"};
        TouristTicket tt = new TouristTicket("bhubaneshwar",
                "visakhapatnam",f,
                departureTime,arrivalTime,p,213,6000,false,
                "",touristLocations);
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getFlightDuration());
        tt.setStatusCancelled();
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getHotelAddress());
        for (String s: tt.getTouristLocations()){
            System.out.println(s);
        }
        printTicketDetails(tt);

         */

    }
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
