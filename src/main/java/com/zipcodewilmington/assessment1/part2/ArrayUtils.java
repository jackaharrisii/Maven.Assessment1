package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++){
            if (objectArray[i] == objectToCount) {count++;}
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] output = new Object[objectArray.length - getNumberOfOccurrences(objectArray,objectToRemove)];  //create a new Object array of length (original minus number to remove)
        int count = 0;  //count will note the current position in the new array as we loop through the old array
        for (int i = 0; i < objectArray.length; i++){    //iterate through the old array
            if (objectArray[i] != objectToRemove){       //if the item is being kept
                output[count] = objectArray[i];          //add it to the new array
                count++;                                 //then advance the counter to the next index in the new array
            }
        }
        System.out.println(Arrays.toString(objectArray));
        System.out.println(objectToRemove);
        System.out.println(Arrays.toString(output));
        return output;                                   //i'm getting what appears in the sout to be the correct answer, but it's not clearing the test - formatting issue? - come back to this
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occurring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object output = objectArray[0];                             //the one below worked fine, but this is much more elegant
        int maxOcc = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (getNumberOfOccurrences(objectArray, objectArray[i]) > maxOcc) {
                output = objectArray[i];
                maxOcc = getNumberOfOccurrences(objectArray,objectArray[i]);
            }
        }
        return output;
    }
//        Arrays.sort(objectArray);                        //first, sort the array so that we can move through it linearly
//        int maxOcc = 1;                                  //counts the object with the greatest number of occurrences
//        int thisOcc = 1;                                 //counts the occurrences of the current object
//        Object output = objectArray[0];                  //creates an output array and sets the value to the first object in the objectArray as a default
//
//        for (int i = 1; i < objectArray.length; i++){    //iterates through the input array
//            if (objectArray[i] == objectArray[i-1]){     //if the object is equal to the previous, increase the current count
//                thisOcc++;
//            }
//            else {                                       //if this object is not equal to the previous, compare the occurrences of the previous to the current max
//                if (thisOcc > maxOcc){                   //then, if this is the new max, save it as the new occurrences to beat
//                    maxOcc = thisOcc;
//                    output = objectArray[i-1];           //and save that object as the current output
//                }
//                thisOcc = 1;
//            }
//        }
//        if (thisOcc > maxOcc){                           //this is the failsafe in case the most frequent is also the last item in the array
//            maxOcc = thisOcc;
//            output = objectArray[objectArray.length - 1];
//        }
//        return output;
//    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occurring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {   //the one below worked fine, but this is much more elegant
        Object output = objectArray[0];
        int minOcc = objectArray.length;
        for(int i = 0; i < objectArray.length; i++){
            if (getNumberOfOccurrences(objectArray,objectArray[i]) < minOcc) {
                output = objectArray[i];
                minOcc = getNumberOfOccurrences(objectArray,objectArray[i]);
            }
        }
        return output;

    }
//        Arrays.sort(objectArray);                        //first, sort the array so that we can move through it linearly
//        int minOcc = objectArray.length;                 //counts the object with the least number of occurrences - defaults to the length of the entire array
//        int thisOcc = 1;                                 //counts the occurrences of the current object
//        Object output = objectArray[0];                  //creates an output array and sets the value to the first object in the objectArray as a default
//
//        for (int i = 1; i < objectArray.length; i++){    //iterates through the input array
//            if (objectArray[i] == objectArray[i-1]){     //if the object is equal to the previous, increase the current count
//                thisOcc++;
//            }
//            else {                                       //if this object is not equal to the previous, compare the occurrences of the previous to the current min
//                if (thisOcc < minOcc){                   //then, if this is the new min, save it as the new occurrences to beat
//                    minOcc = thisOcc;
//                    output = objectArray[i-1];           //and save that object as the current output
//                }
//                thisOcc = 1;                             //resets the counter for the next object
//            }
//        }
//        if (thisOcc < minOcc){                           //this is the failsafe in case the least frequent is also the last item in the array
//            minOcc = thisOcc;
//            output = objectArray[objectArray.length - 1];
//        }
//        return output;    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {  //this is probably failing for the same reason as the remove value test - formatting issue???
        Object[] output = new Object[objectArray.length + objectArrayToAdd.length];        //I'll come back to these two if I have time at the end
        for (int i = 0; i < objectArray.length; i++){
            output[i] = objectArray[i];
        }
        for (int j = 0; j < objectArrayToAdd.length; j++){
            output[j + objectArray.length] = objectArrayToAdd[j];
        }
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(objectArrayToAdd));
        System.out.println(Arrays.toString(output));
        return output;
    }
}
