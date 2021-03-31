package com.sparta.jack;

public class Main {

    public static void main(String[] args) {
        try {
            throw new MyException("test");

        } catch (MyException e) {
            

        } finally {// block of code that is always executed irrespective if the exception occurs or not}
        }
    }
}
