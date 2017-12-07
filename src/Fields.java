public class Fields {

    //Field can be values from Address or Customer --> Need Type Specification
    //Can support sort order --> Sorted Ascending, Sorted Descending, Not Sorted
    //Use Enums?

    private enum Order{ ASCENDING, DESCENDING, NOTSORTED}
    private enum Type{NAME, LASTNAME, STREET1, STREET2, STATE, CITY, ZIPCODE};

    private Order sorted;
    private Type typeSpec;


    public Fields(Type typeSpec, Order sorted){
        this.typeSpec = typeSpec;
        this.sorted = sorted;
    }

    //Getters and Setters:
    public Order getSorted() {
        return sorted;
    }

    public void setSorted(Order sorted) {
        this.sorted = sorted;
    }

    public Type getTypeSpec() {
        return typeSpec;
    }

    public void setTypeSpec(Type typeSpec) {
        this.typeSpec = typeSpec;
    }
}
