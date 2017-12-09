import java.util.*;
public class SearchCrit {

    //Search Fields
    private List<Fields> fieldsList;
    private int numFieldsMax = 10; //Set Default Value

    //Constructor:
    public SearchCrit(int max){
        this.fieldsList = new ArrayList<Fields>();
        this.numFieldsMax = max;
    }

    //Getters and Setters:

    public List<Fields> getFieldsList() {
        return fieldsList;
    }

    public void setFieldsList(List<Fields> fieldsList) {
        this.fieldsList = fieldsList;
    }

    public int getNumFieldsMax() {
        return numFieldsMax;
    }

    public void setNumFieldsMax(int numFieldsMax) {
        this.numFieldsMax = numFieldsMax;
    }

    //Realized in testing we need a way to add a field to the search criteria:
    public void addAField(Fields f){
        this.getFieldsList().add(f);
    }
}





