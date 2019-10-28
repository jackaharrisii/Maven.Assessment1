package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String output = str.substring(0,1).toUpperCase() + str.substring(1);
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String output = new StringBuilder(str).reverse().toString();
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String temp = reverse(str);
        String output = camelCase(temp);
        return output;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String output = str.substring(1,str.length()-1);
        return output;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] output = str.toCharArray();
        for (int i  = 0; i < output.length; i++){
            char each = output[i];
            if (Character.isUpperCase(each)){
                output[i] = Character.toLowerCase(each);
            }
            else if (Character.isLowerCase(each)){
                output[i] = Character.toUpperCase(each);
            }
        }
        return new String(output);
    }
}
