package com.github.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;

public class TestWordGuess {
    @Test
    public void testSetName(){
        WordGuess word = new WordGuess();
        String expected = "John";

        word.setName(expected);


        String actual = word.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetRandomNumber(){
        WordGuess word = new WordGuess();
        int expected = (int) (Math.random() * 4) +1;
        System.out.println(expected);

        word.setRandomNumber(expected);

        int actual = word.getRandomNumber();
        Assert.assertEquals(expected, actual);
    }
}
