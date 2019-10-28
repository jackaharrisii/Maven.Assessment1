package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer output = 0;
        for (int i = 0; i <= n; i++){
            output += i;
        }
        return output;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer output = 1;
        for (int i = 1; i <= n; i++){
            output = output * i;
        }
        return output;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int output = 0;
        while(val > 0){
            output = output * 10 + val % 10;      //moves the decimal of output one to the right, then adds the last digit of val
            val = val/10;                         //moves the decimal of val one to the left, then discards the decimal because it's an integer
        }
        return output;
    }
}
