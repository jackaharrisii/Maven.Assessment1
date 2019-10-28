package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */


    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] output = deleteMultiplesOfN(ints,2);
        return output;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int countDel = 0;
        int countAdd = 0;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] %2 == 1){countDel++;}
        }
        Integer[] output = new Integer[ints.length - countDel];
        for (int j = 0; j < ints.length; j++){
            if (ints[j] %2 != 1){
                output[countAdd] = ints[j];
                countAdd++;
            }
        }
        return output;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] output = deleteMultiplesOfN(ints, 3);
        return output;    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int countDel = 0;
        int countAdd = 0;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] %multiple == 0){countDel++;}
        }
        Integer[] output = new Integer[ints.length - countDel];
        for (int j = 0; j < ints.length; j++){
            if (ints[j] %multiple != 0){
                output[countAdd] = ints[j];
                countAdd++;
            }
        }
        return output;    }
}
