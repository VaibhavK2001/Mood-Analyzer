package org.example;

import java.sql.SQLOutput;

public class MoodAnalyzer extends  Exception{

    String message = "";

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood(){
        try{
            if (message == null) {
                throw new NullPointerException();
            }
        }
        catch(NullPointerException e){
                System.out.println("Invalid input 'null'");
                return "HAPPY";
            }

        if (message.toLowerCase().contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Mood Analyzer Problem");

    }
}