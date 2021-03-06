import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeImplem implements Range{

    // Must have a default constructor

    /*
    Create a new Range object representing an integer interval starting from "from" and "to", both
    limits inclusive
 */

    private Set<Integer> range;

    //default constructor
    public RangeImplem() {
        range = Collections.<Integer>emptySet();
    }

    public RangeImplem(int from, int to){
        //Java 8 way
        this.range = IntStream.range(from, to+1).boxed().collect(Collectors.toSet());
    }

    public Set<Integer> getRange(){
        return this.range;
    }
    public Range newRange(int from, int to){
        Range range = new RangeImplem(from, to);
        return range;
    }

    /*
        Return if "value" is in the range defined by this object
     */
    @Override
    public boolean isIn(int value){
        Integer intVal = Integer.valueOf(value);
        if(this.range.contains(intVal)){
            return true;
        }
        return false;
    }

    /*
        Return the minimum value in range
     */
    @Override
    public int min(){
        //using streams:
        Integer min = this.range.stream().min(Comparator.comparing(Integer::intValue)).get();
        return min;

    }

    /*
        Return the maximum value in range
     */
    @Override
    public int max(){
        //similar to "min" but we can just use max here instead
        Integer max = this.range.stream().max(Comparator.comparing(Integer::intValue)).get();
        return max;
    }

    /*
        Add range 'r' to this range and return 'this'.
        'r' and this may denote disjoint ranges, for instance:
        r.newRange(1,5).add(r.newRange(8,10)) denotes a range
        including 1,2,3,4,5,8,9,10
     */
    @Override
    public Range add(Range r){
        Set<Integer> range2 = ((RangeImplem)r).getRange();
        this.range.addAll(range2);
        return this;

    }

    //Got to the bonus:
    @Override
    public Range subtract(Range r){
        Set<Integer> range2 = ((RangeImplem)r).getRange();
        //Similar to add, but can use removeAll:
        this.range.removeAll(range2);
        return this;

    }

    //Used for testing purposes:
/*
    public static void main(String[] args){
        Range r = new RangeImplem();
        Range newR = r.newRange(1,5).add(r.newRange(8,10));

        if(!newR.isIn(6) && !newR.isIn(7) && newR.isIn(1) && newR.isIn(2) && newR.isIn(3) && newR.isIn(4)
                && newR.isIn(5) && newR.isIn(8) && newR.isIn(9) && newR.isIn(10) && !newR.isIn(11)
                && newR.max() == 10 && newR.min() == 1){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");

        }


        Range r2 = new RangeImplem();
        Range newR2 = r2.newRange(1,7).add(r2.newRange(10,12)).subtract(r2.newRange(4,6));

        if(!newR2.isIn(6) && newR2.isIn(7) && newR2.isIn(1) && newR2.isIn(2) && newR2.isIn(3) && !newR2.isIn(4)
                && !newR2.isIn(5) && !newR2.isIn(8) && !newR2.isIn(9) && newR2.isIn(10) && newR2.isIn(11)
               && newR2.isIn(12) && newR2.max() == 12 && newR2.min() == 1){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");

        }

    }*/
}
