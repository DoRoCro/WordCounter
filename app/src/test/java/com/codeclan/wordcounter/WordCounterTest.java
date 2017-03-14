package com.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 14/03/2017.
 */
public class WordCounterTest {

    WordCounter wordcounter;
    String testText1;
    String testText2;
    String testText3;
    String testText4;

    @Before
    public void setUp() throws Exception {
        testText1 = "A word";
        testText2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity,";
        testText3 = " ";
        testText4 = "";
    }

    @Test
    public void canSplitTextIntoWords() throws Exception {
        wordcounter = new WordCounter();
    }
}