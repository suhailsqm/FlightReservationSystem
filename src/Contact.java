public class Contact {
    private String name;
    private String phoneNumber;
    private String emailId;
    public Contact(String name,String phoneNumber, String emailId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public  String getContactDetails() {
        return name + "@" + phoneNumber + "@" +emailId;
    }
    public void setContactDetails(String contactDetails) {
        String[] contactArray = contactDetails.split("@",3);
        name = contactArray[0];
        phoneNumber = contactArray[1];
        emailId = contactArray[2];
    }
    public  void  setContactDetails(String name,String phoneNumber, String emailId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

}
