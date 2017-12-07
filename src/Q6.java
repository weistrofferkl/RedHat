import java.util.*;
public interface Q6 {

    /*
        Define a searchCustomers API with the following requirements:
            -Return type is List<Customer>
            -Caller will specify a search criteria with several search fields
                -Each search field can be a customer field, or an address field.
                -For instance it should be possible to search for all customers living in a certain state with a given last name
            -Caller can specify a sort field and sort order in which the results will be returned
            -Implementation will be stateless
            -API must limit number of records by each call to protect against very large result sets


            -Write the API signature, and any other class required by that API.
            Write the API as a Java Interface
            -Do not write an implementation for the interface


        TO DO:
            -Address Class
            -Customer Class
            -SearchCriteria class

            Need:
                -Sort Fields
                -Limit number of records returned
     */

    List<Customer> searchCustomers(SearchCrit crit);



}

