package com.codeclan.wordcounter;

import java.util.HashMap;

/**
 * Created by user on 14/03/2017.
 */

public class WordCounter {

//    public enum wordFreqSort { SORTED, UNSORTED;}

    public static long wordCount(String input){
        if (input == " " || input == "") {
            return 0;
        }
        // split based on word boundaries.  Can generate empty strings, so need to check whic are valid
        long count = 0L;
        try {
            String[] words = input.split("\\W+");
            count = words.length;
            if ( words[0] == "") { count--;}
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Exception");
            count = 0;
        }

//        for (String word : words) {
//            if( word.isEmpty() ) {
//                // ignore
//            }
//            else {
//                count++;
//            }
//        }
        finally {
            return count;
        }
    }
    public static String wordFrequencyList(String input ) {


        HashMap<String, Integer> wordfreqhash = new HashMap<String, Integer>();

        if (input == " " || input == "") {
            return "";
        }
        // split based on word boundaries.  Can generate empty strings, so need to check whic are valid
        try {
            String[] words = input.split("\\W+");
            for (String word : words) {
                if(wordfreqhash.containsKey(word)){
                    wordfreqhash.put(word, wordfreqhash.get(word) + 1);
                }
                else {
                    wordfreqhash.put(word,1);
                }
            }
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Exception");
        }

        // assemble return string
        String returnString = "";
        Integer maxValue = 1;
        int i = 0;
        for (String word : wordfreqhash.keySet()){
            i++;
            returnString += "\"" + word +"\" : " + wordfreqhash.get(word);
            if(i < wordfreqhash.size()) {
                returnString = returnString + ", ";
            }
            maxValue = Math.max(maxValue, wordfreqhash.get(word));
        }
//        return "\"A\" : 2, \"B\" : 1,";
        return returnString;
    }
}
