package org.example;

public class MoodAnalyzer {

    public String analyzeMood(String mood){
       if (mood.equalsIgnoreCase("I am in sad mood")){
            return "SAD";
        }else{
            return null;
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Mood Analyzer Problem");
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
//        String mood = moodAnalyzer.analyzeMood("I am in sad mood");
//        System.out.println(mood);
    }
}