package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    public void exceptionHandlingTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("SAD");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD",mood);
    }
}