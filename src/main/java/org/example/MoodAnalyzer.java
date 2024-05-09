package org.example;

enum Mood{
    HAPPY,SAD,NULL,EMPTY;
}

class MoodAnalysisException extends  Exception{

    public MoodAnalysisException(String str){
        super(str);
    }
}

public class MoodAnalyzer extends Exception{

    String message = "";

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalysisException{
        Mood mood;
      try{
          if (message == null || message.isEmpty()){
              throw new MoodAnalysisException("HAPPY");
          }
      }catch(MoodAnalysisException e){
          return e.getMessage();
      }
        if (message.toLowerCase().contains("sad")){
            mood = Mood.SAD;
        }
        else {
            mood = Mood.HAPPY;
        }
        return mood.toString();

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Mood Analyzer Problem");


    }
}