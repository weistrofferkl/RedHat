public class Q2 {
    /*
        Given that there are 50,000 items in the input String array, the
        function must add all array items to outputString and then return
        the outputString. If forceUpperCase is true, the return string mush be upper case
     */


    //Original Given Function:
   /* public String addStringItems(String[] items, boolean forceUpperCase){
        String returnValue = "";
        for(int i = 0; i < items.length; i++){
            returnValue += items[i];

        }
        return forceUpperCase?returnValue.toUpperCase():returnValue;
    }
   */

    //Corrected Function:
    public static String addStringItems(String[] items, boolean forceUpperCase){
        //Java has a nifty thing called StringBuilder that makes stuff like this nice:
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< items.length; i++){
            //using the StringBuilder .append() to add the value:
            sb.append(items[i]);
        }

        //Convert to string to return correct output format:
        String output  = sb.toString();

        //if forceUpperCase is true, we convert our output to Uppercase and return
        //otherwise we just return the original output:
        return forceUpperCase ? output.toUpperCase() : output;
    }

//Used for testing purposes:

    /*
    public static void main(String[] args){
        String[] s = {"Hi ", " A ", " PEPPER ", "  STUFF", " me ", " o ", " LOwerCaSe "};
        String[] ns = s;

        String newString = addStringItems(s, false);
        String newString2 = addStringItems(ns, true);
        System.out.println("NEW STRING: " + newString);
        System.out.println("NEW STRING2: " + newString2);
    }*/
}

