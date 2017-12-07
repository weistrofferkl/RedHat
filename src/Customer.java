import java.util.*;
public class Customer {

    //Given variables:
    private String name;
    private String lastName;
    private List<Address>addresses;

    //Constructor:
    public Customer(){
        this.name = null;
        this.lastName = null;
        this.addresses = new ArrayList<>();
    }

    public Customer(String name, String lastName, Address A1 ){
        this.name = name;
        this.lastName = lastName;
        this.addresses = new ArrayList<>();
        this.addresses.add(A1);
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

  /*  public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }*/
}

