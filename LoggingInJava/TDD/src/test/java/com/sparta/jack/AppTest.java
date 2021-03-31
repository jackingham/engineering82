package com.sparta.jack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("This test will return fizz if user inputs a value divisible by 3")
    public void shouldReturnFizz()
    {
        Assertions.assertEquals("Fizz", FizzBuzzGenerator.generateFizzBuzz(3));
    }


    @Test
    @DisplayName("This test will return buzz if user inputs a value divisible by 5")
    public void shouldReturnBuzz()
    {
        Assertions.assertEquals("Buzz", FizzBuzzGenerator.generateFizzBuzz(5));
    }

    @Test
    @DisplayName("This test will return fizzbuzz if user inputs a value divisible by 3 and 5")
    public void shouldReturnFizzBuzz()
    {
        Assertions.assertEquals("FizzBuzz", FizzBuzzGenerator.generateFizzBuzz(15));
    }

    @Test
    @DisplayName("This test will return the number if none other conditions met")
    public void shouldReturnNumber()
    {
        Assertions.assertEquals("43", FizzBuzzGenerator.generateFizzBuzz(43));
    }


    @Test
    public void shouldReturnFizzBuzzArray(){

        int[] input = {1,2,3,4,5,6};
        String[] expected = {"1","2","Fizz","4","Buzz","Fizz"};


        Assertions.assertArrayEquals(expected,FizzBuzzGenerator.fizzBuzzArrayGenerator(input));
    }
}
