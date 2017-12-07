import java.util.*;
import static java.lang.Math.abs;
public class Conversion {

    /*
        Convert a base-10 integer to an 8-bit two's complement binary number, and return
        the binary number
     */
    public static String base10to2(String base10){

        int numB10 = Integer.parseInt(base10);
        boolean negFlag = false;
        //numB10 = abs(numB10);
        //convert to base 2

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
            // return base2;
        }

        //TO DO:
            //Add in less than and greater than error checking

        if(negFlag == true){
            System.out.println("Base 2: " + base2);
            base2 = flip8Bits(base2);
        }



        return base2;
    }

    public static String padding(String input){
        return String.format("%0" + (8-input.length()) + "d%s", 0, input);
    }
    //
    public static String flip8Bits(String num){
        if(num.length() < 8 || num.length() > 8){
            //throw error
        }
        System.out.println("INcoming num: " + num);
        //want to flip all the bits and add 1

            char[] charStr = num.toCharArray();
            for(int i = 0; i < num.length(); i++){
                if(charStr[i] == '0'){
                    System.out.println("HI2");
                    charStr[i] = '1';
                }
                else if(charStr[i] == '1'){
                    System.out.println("HI3");
                   charStr[i] = '0';
                }
                else{
                    //Throw error
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

    public static String negBase2(String base10){

        int numB10 = Integer.parseInt(base10);

        if(numB10 == 0){
            //Throw exception if zero

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

    public static void main(String[] args){
        String testNum = "-127";
        String output = negBase2(testNum);
        System.out.println(output);
    }
}
