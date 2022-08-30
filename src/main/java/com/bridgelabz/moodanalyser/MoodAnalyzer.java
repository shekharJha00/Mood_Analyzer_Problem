package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {

        private String message;

        public MoodAnalyzer(String message) {
            this.message = message;
        }

        public String analyseMood(String message) throws exception {
            this.message = message;
            return analyseMood();
        }

        public String analyseMood() throws exception {
            try {
                if (message.length() == 0)
                    throw new exception(exception.exceptionType.ENTERED_EMPTY, "Please enter Proper Mood");
                if (message.contains("Sad"))
                    return "SAD";
                else
                    return "HAPPY";
            } catch (NullPointerException e) {
                throw new exception(exception.exceptionType.ENTERED_NULL, "Please enter Proper Mood");
            }
        }}
