package com.codeclan.wordcounter;

/**
 * Created by user on 14/03/2017.
 */

public class WordCounter {


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
}
