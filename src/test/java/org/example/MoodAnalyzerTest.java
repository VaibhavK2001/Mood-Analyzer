package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    public void sadMoodTest(){
         MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
         String mood = moodAnalyzer.analyzeMood();
         Assertions.assertEquals("SAD",mood);
    }
}