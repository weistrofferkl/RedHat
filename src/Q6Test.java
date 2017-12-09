public class Q6Test {

    public static void main(String[] args){
        Address aTest = new Address("100", "Test Street", "MA","000001", "Test City");
        System.out.println("Street1: " + aTest.getStreet1());
        System.out.println("Street2: " + aTest.getStreet2());
        System.out.println("State: " + aTest.getState());
        System.out.println("Zip Code: " + aTest.getZipCode());
        System.out.println("City: " + aTest.getCity());

        Customer cTest = new Customer("Bob", "Bobbert", aTest);
        System.out.println("Name: " + cTest.getName());
        System.out.println("Last Name: " + cTest.getLastName());
        System.out.println("Address: " + cTest.getAddresses());

        SearchCrit sCTest = new SearchCrit(20);
        System.out.println("Max Fields: " + sCTest.getNumFieldsMax());
        System.out.println("Current Fields: " + sCTest.getFieldsList().size());

        Fields fTest =  new Fields(Fields.Type.NAME, Fields.Order.ASCENDING);
        sCTest.addAField(fTest);
        Fields fTest2 =  new Fields(Fields.Type.NAME, Fields.Order.ASCENDING);
        sCTest.addAField(fTest2);
        System.out.println("Current Fields: " + sCTest.getFieldsList().size());

    }
}
