package com.github.zipcodewilmington;

public class WordGuess {

    public static int randomNumber(int random){
        random = (int) (Math.random() * 5) + 5;
        return random;
    }


    private String name;
    private int random;
    String[] words = {"bird", "lion", "frog", "duck"};
    Character[] guesses = {'_', '_', '_', '_'};
//    public WordGuess(String name, int random) {
//        this.name = name;
//
//        this.random = (int) (Math.random() * 4) + 4;
//    }

    public  int getRandomNumber() {
        return random;
     }

    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }

    public void setRandomNumber(int random){
        this.random = random;
    }




//    public static String randomNumber(){
//
//
//
//        return String.valueOf(randomWord);
//
//    }
}
