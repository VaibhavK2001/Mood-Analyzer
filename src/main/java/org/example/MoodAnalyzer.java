package org.example;

public class MoodAnalyzer {

    public String analyzeMood(String mood){
        if (mood.equalsIgnoreCase("Happy")){
            return "HAPPY";
        }if (mood.equalsIgnoreCase("Sad")){
            return "SAD";
        }else{
            return null;
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Mood Analyzer Problem");
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("happy");
        System.out.println(mood);
    }
}