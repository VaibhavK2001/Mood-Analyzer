package org.example;

class MoodAnalysisException extends  Exception{

    public MoodAnalysisException(String str){
        super(str);
    }
}

public class MoodAnalyzer{

    String message = "";

    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalysisException{
      if (message == null || message.isEmpty()){
          throw new MoodAnalysisException("Invalid Mood, input cannot be null or empty");
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
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try{
            String mood = moodAnalyzer.analyzeMood();
            System.out.println(mood);
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }

    }
}