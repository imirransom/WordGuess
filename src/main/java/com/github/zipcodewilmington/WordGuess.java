package com.github.zipcodewilmington;

public class WordGuess {

    public static int randomNumber(int random){
        random = (int) (Math.random() * 5) + 5;
        return random;
    }


    String name;
    int randomNumebr;
    String[] words = {"bird", "lion", "frog", "duck"};
    Character[] guesses = {'_', '_', '_', '_'};
    public WordGuess(String name, int randomNumber) {
        this.name = name;

        this.randomNumebr = (int) (Math.random() * 4) + 4;
    }
    public static String getName(String name){
        return name;
    }
     public static int getRandomNumber() {
        return randomNumber;
     }

    public static void setName(){
        this.name = name;
    }

//    public static String randomNumber(){
//
//
//
//        return String.valueOf(randomWord);
//
//    }
}
