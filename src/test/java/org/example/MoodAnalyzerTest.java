package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    void sadMoodTest() {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in sad mood");
        Assertions.assertEquals("SAD",mood);
    }
}