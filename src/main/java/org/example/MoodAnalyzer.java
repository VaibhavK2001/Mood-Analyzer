package org.example;

public class MoodAnalyzer {

    String message = "";

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message.toLowerCase();
    }

    public String analyzeMood(){
        if (message.contains("sad")){
            return "SAD";
        } else if (message.contains("happy")) {
            return "HAPPY";
        }else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Mood Analyzer Problem");

    }
}