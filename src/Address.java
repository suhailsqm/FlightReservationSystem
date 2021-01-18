public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public String getAddressDetails() {
        return street + "@" + city + "@" + state;
    }
    public void updateAddressDetails(String address) {
        String[] arrayAddress = address.split("@",3);
        this.street = arrayAddress[0];
        this.city = arrayAddress[1];
        this.state = arrayAddress[2];
    }
    public void updateAddressDetails(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}
