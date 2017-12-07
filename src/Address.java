public class Address {

    //Given and implied address variables:
    private String street1;
    private String street2;
    private String state;
    private String zipCode;
    private String city;

    //Default Constructor:
    public Address(){
        this.street1 = null;
        this.street2 = null;
        this.state = null;
        this.zipCode = null;
        this.city = null;
    }


    public Address(String street1, String street2, String state, String zipCode, String city){
        this.street1 = street1;
        this.street2 = street2;
        this.state = state;
        this.zipCode = zipCode;
        this.city = city;
    }

    //Getters and Setters
    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
