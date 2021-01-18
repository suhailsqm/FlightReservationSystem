import  java.util.*;
public class Main {
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
        Flight f = new Flight(87,"Air India",300,3);
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
        System.out.println(p1.getContact());
        System.out.println(p1.getId());
        System.out.println(Passenger.getIdCounter());
        System.out.println(Passenger.getPassengerCount());

        String arrivalTime = "21/01/01 23:23:34";
        String departureTime ="20/12/31 5:23:32";
        RegularTicket rt = new RegularTicket("13232","bhubaneshwar",
                "visakhapatnam",f,
                departureTime,arrivalTime,p,213,6000,false,null);
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getFlightDuration());
        rt.setStatusCancelled();
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getSpecialService());
        rt.updateSpecialService(null);

        String[] touristLocations = {"shimla","manali","ooty"};
        TouristTicket tt = new TouristTicket("13232","bhubaneshwar",
                "visakhapatnam",f,
                departureTime,arrivalTime,p,213,6000,false,
                "",touristLocations);
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getFlightDuration());
        tt.setStatusCancelled();
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getHotelAddress());
        for (String s: tt.touristLocations){
            System.out.println(s);
        }




    }
}
