package round2.PersonDemographics;
enum CONTACT{
    WORK,
    MOBILE,
    HOME;
}
public class Address {
    private String apartment;
    private String street;
    private String city;
    private String state;
    private int pincode;

    Address(String apartment,String street,String city,String state,int pincode){

        this.apartment = apartment;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getApartment() {
        return apartment;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

  public String getState() {
        return state;
    }

    public int getPincode() {
        return pincode;
    }

 }
