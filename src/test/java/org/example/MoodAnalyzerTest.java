package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    public void MoodAnalysisExceptionTest() throws MoodAnalysisException{

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY",mood);
    }
}