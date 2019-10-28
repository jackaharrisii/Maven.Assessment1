package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome extends BasicStringUtils {

    public Integer countPalindromes(String input){
        /* PROBLEM FRAMING
           first, count all the single letters
           next, count all adjacent letters that match
           third, count all triples that work
           quads, pents, etc
           use a for loop that starts with substrings of length =1 and progress to substrings of length = length
           use the reverse function from BasicStringUtils to test if each segment is a palindrome or not
           if it is, increment the counter
         */

        int count = 0;                                                                    //to count all palindromes
        String checkString;
        for (int segmentLength = 1; segmentLength <= input.length(); segmentLength++){    //loops through different length segments
            for (int i = 0; i <= input.length()-segmentLength; i++){                      //loops through all segments of a given length defined by the above loop
                checkString = input.substring(i,i + segmentLength);                       //strictly unnecessary, but makes the if statement more human readable
                if(checkString.equals(reverse(checkString))){count++;}                    //if segment matches the reverse segment, increase the count by one
            }
        }
        return count;
    }
}
