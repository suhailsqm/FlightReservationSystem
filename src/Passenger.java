import  java.util.*;

public class Passenger {
    private  int id;
    private Contact contact;
    private Address address;

    public  Passenger(int id,String name,String phoneNumber, String emailId,String street, String city, String state ){
        this.id = id;
        Contact contact = new Contact(name, phoneNumber, emailId);
        this.contact = contact;
        Address address = new Address(street, city, state);
        this.address = address;
    }
    public int getId() {
        return  id;
    }
    public Contact getContact() {
        return contact;
    }
    public Address getAddress() {
        return  address;
    }
}
