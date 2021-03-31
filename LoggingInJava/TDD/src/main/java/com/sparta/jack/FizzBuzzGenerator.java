package com.sparta.jack;

public class FizzBuzzGenerator {
    public static String generateFizzBuzz(int number) {
        String temp = "";
        if (number % 3 == 0 && number % 5 ==0){
            temp = "FizzBuzz";
        } else if (number % 3 == 0) {
            temp = "Fizz";
        } else if (number % 5 == 0){
            temp = "Buzz";
        } else {
            temp = Integer.toString(number);
        }
        return temp;
    }

    public static String[] fizzBuzzArrayGenerator(int[] arrayIn){
        String[] output = new String[arrayIn.length];
        int i = 0;
        for (int j : arrayIn){
            output[i++] = generateFizzBuzz(j);
        }
        return output;

    }
}
