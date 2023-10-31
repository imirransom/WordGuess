package com.github.zipcodewilmington;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, contestant. would you like to start the game?");
        System.out.println("Please enter \"yes\" or \"no\"");
        String gameStart = scanner.nextLine();

        while (gameStart == "yes"){
            System.out.println("Let's begin");
        }
    }
}

