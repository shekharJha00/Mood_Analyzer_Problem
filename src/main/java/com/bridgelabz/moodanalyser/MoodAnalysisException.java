package com.bridgelabz.moodanalyser;

public class exception extends Exception {

        public exceptionType type;

        public exception(exceptionType type, String message) {
            super(message);
            this.type = type;
        }

        public enum exceptionType {
            ENTERED_EMPTY, ENTERED_NULL
        }
    }


