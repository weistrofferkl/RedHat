import java.util.*;
import static java.lang.Math.abs;
public class Conversion {

    /*
        Convert a base-10 integer to an 8-bit two's complement binary number, and return
        the binary number
     */
    public static String base10to2(String base10) throws Exception {

        int numB10 = Integer.parseInt(base10);

        //When signed, 8bit values are from -128 to 127.
        if(numB10 < -128 || numB10 > 127){
            throw new Exception("ERROR: Input value cannot be converted to 8-bit representation as it is outside the range: -128 <= x <= 127");
        }
        boolean negFlag = false;

        //Handle pesky negative numbers:
        if(numB10 < 0){
            negFlag = true;
            numB10 = abs(numB10);
        }

        //toString() is nice where we can convert to diff bases:
        String base2 = Integer.toString(numB10,2);


        //check if less than 8 bits:
        if(base2.length() < 8){
            //if so pad with 0's
            base2 = padding(base2);

        }

        //2's complement on negative inputs:
        if(negFlag == true){
            base2 = flip8Bits(base2);
        }

        return base2;
    }

    public static String padding(String input){
        return String.format("%0" + (8-input.length()) + "d%s", 0, input);
    }

    public static String flip8Bits(String num) throws Exception{
        if(num.length() < 8 || num.length() > 8){
            throw new Exception("ERROR: Input must consist of 8 bits");
        }
        //want to flip all the bits and add 1

            //Easier (imo) to handle using a char array rather than replacing/creating strings:
            char[] charStr = num.toCharArray();

            for(int i = 0; i < num.length(); i++){
                if(charStr[i] == '0'){
                    charStr[i] = '1';
                }
                else if(charStr[i] == '1'){
                   charStr[i] = '0';
                }
                else{
                    //Throw error:
                    throw new Exception("ERROR: Bits must only be a '1' or a '0'");
                }
            }

            int numInt = Integer.parseInt(String.valueOf(charStr),2);
            numInt+=1;

            return Integer.toString(numInt, 2);
    }

    /*
        Return 2's complement negative of the given base10 number and return the
        binary number
     */

    public static String negBase2(String base10) throws Exception{

        int numB10 = Integer.parseInt(base10);

        if(numB10 == 0){
            //Throw Error:
           throw new Exception("ERROR: Cannot convert '0' to a negative representation");

        }else if(numB10 > 0){
            numB10 *= -1;

        }
        //convert to base 2, 8 bit number:
        String strB2 = base10to2(Integer.toString(numB10));

        //I was confused here about what the problem was asking, I interpreted both methods to be asking to implement
        //2's complement, but that this method would deal with negating and positive number and returning its complement.

        return strB2;
    }


    //Must be able to handle any base-10 integer that is submitted as a command line argument, even negative numbers
    //Provide suitable error handling.

    //Used for testing purposes:
    /*public static void main(String[] args) throws Exception {
        String testNum = "10";
        String output = null;
        output = base10to2(testNum);
        System.out.println(testNum + " : " +output);

        testNum = "-128";
        output = base10to2(testNum);
        System.out.println(testNum + " : " +output);

        testNum = "-127";
        output = base10to2(testNum);
        System.out.println(testNum + " : " +output);

        testNum = "127";
        output = base10to2(testNum);
        System.out.println(testNum + " : " +output);

        testNum = "-0";
        output = base10to2(testNum);
        System.out.println(testNum + " : " +output);

        testNum = "0";
        output = base10to2(testNum);
        System.out.println(testNum + " : " +output);

        testNum = "10";
        output = negBase2(testNum);
        System.out.println(testNum + " : " +output);

        testNum = "128";
        output = negBase2(testNum);
        System.out.println(testNum + " : " +output);


        //Test Exception:
     /*   testNum = "-150";
        output = base10to2(testNum);
        System.out.println(testNum + " : " +output);*/

     /*   testNum = "128";
        output = base10to2(testNum);
        System.out.println(testNum + " : " +output); */

     /*   testNum = "0";
        output = negBase2(testNum);
        System.out.println(testNum + " : " +output); */

     /*  testNum = "129";
        output = negBase2(testNum);
        System.out.println(testNum + " : " +output);
    }
    */
}
