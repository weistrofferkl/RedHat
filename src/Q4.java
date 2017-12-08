import java.util.Iterator;
import java.util.*;

public class Q4 {
    /*
        Write a function:
        public List<String> combine(Iterator<String> itr1, Iterator<String> itr2);
        itr1 and itr2 iterate over their contents in sorted order
        The result is the combination of itr1 and itr2, in the same order itr1 and itr2 is sorted
        The function should operate in O(n) time
     */

    //Combine two strings using Java iterators
    public static List<String> combine (Iterator<String> itr1, Iterator<String> itr2){
        //iterate over contents
        //combine results
        //O(n)

        List<String> output = new ArrayList<String>();

        //Add all of itr1's content to the output:
        while(itr1.hasNext()){
            String str = itr1.next();
            output.add(str);
        }

        //Add all of itr2's content to the output:
        while(itr2.hasNext()){
            String str = itr2.next();
            output.add(str);
        }

        //Return the combination:
        return output;
    }

    //O(1) could use the peeking Iterator:
    // (https://google.github.io/guava/releases/19.0/api/docs/com/google/common/collect/PeekingIterator.html)

    public static void main(String[] args){
        List<String> testList1 = new ArrayList<String>();
        List<String> testList2 = new ArrayList<String>();
        List<String> output = new ArrayList<String>();

        testList1.add("Hello");
        testList1.add("World");
        testList2.add("I");
        testList2.add("Am");
        testList2.add("Robot");

        output = combine(testList1.iterator(), testList2.iterator());
        System.out.println("Output: "+ output);


    }

}
