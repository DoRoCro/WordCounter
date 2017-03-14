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
    public void canReturnACount() throws Exception {
        assertEquals(2L, WordCounter.wordCount(testText1));
    }

    @Test
    public void canReturnZero() throws Exception {
        assertEquals(0L, WordCounter.wordCount(testText3));
        assertEquals(0L, WordCounter.wordCount(testText4));
    }

    @Test
    public void worksWithSentencesWithPuctuation() throws Exception {
        assertEquals(36L,WordCounter.wordCount(testText2));
        assertEquals(0L, WordCounter.wordCount(", ,"));
    }

    @Test
    public void canCountWordFrequencies() throws Exception {
        assertEquals("\"A\" : 2, \"B\" : 1", WordCounter.wordFrequencyList("A B A"));
    }

}