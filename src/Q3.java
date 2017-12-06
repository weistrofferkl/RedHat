import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Q3 {
    /*
        Using the Java Collections Framework:
            -Change the optimized function implementation from question #2 above.
            -Have the code:
                1. add each array item to a Collection implementation
                2. iterate over the Collection and return all values as a concatenated ... (Recruiter didnt complete the sentence)
                3. if forceUpperCase is true, returned value must be all upper case
            -Tell me why you chose the container implementation that you did.
            -Is the optimized function thread safe?
            -Is the unoptimized function thread safe?
            -If not, how can you make it thread safe?
     */

    //Corrected Function:
  /*  public static String addStringItems(String[] items, boolean forceUpperCase){
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
    }*/


    public static String addStringItems(String[] items, boolean forceUpperCase){
        //Using List interface due to its flexibility and allowance of duplicate elements (unlike set)
        List<String> strL = new ArrayList<String>(Arrays.asList(items));

        //Can use streams here rather than a for-loop, and Collectors.joining() to bundle
        //it all up nicely:
        String output = strL.stream().collect(Collectors.joining());

        //if forceUpperCase is true, we convert our output to Uppercase and return
        //otherwise we just return the original output:
        return forceUpperCase ? output.toUpperCase() : output;

        //Is the optimized function thread safe?
            //No, it uses ArrayList which has not been synchronized to allow for optimal performance
            //Can be made thread safe using Vector instead (but will not be as optimal of a solution)
        //Is the unoptimized function thread safe?
            //Arrays are immutable in java, so this should be thread safe.


    }

    public static void main(String[] args){
        String[] s = {"Hi", "A", "PERER", "STUFF", "me", "o", "LOwerCaSe"};
        String[] ns = s;

        String newString = addStringItems(s, false);
        String newString2 = addStringItems(ns, true);
        System.out.println("NEW STRING: " + newString);
        System.out.println("NEW STRING2: " + newString2);
    }

}
