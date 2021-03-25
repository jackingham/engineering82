package com.sparta.jack;

public class FibonacciClass {
    public static int fibonacci(int input){
        if (input == 1 || input == 2){
            return input-1;
        } else {
            return (fibonacci(input-1)+(fibonacci(input-2)));
        }
    }
}


