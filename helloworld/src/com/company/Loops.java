package com.company;

public class Loops {
    public static void forLoop(){
        for (int i=1; i<10; i++){
            System.out.println("While loop in iteration " + i);
        }

    }

    public static void whileLoop(){
        Boolean isWhileLoopRunning = true;
        while (isWhileLoopRunning) {
            System.out.println("While loop running, condition is " +isWhileLoopRunning);
            isWhileLoopRunning = false;
        }
        System.out.println("While loop finished, condition is "+isWhileLoopRunning);

    }

    public static void doWhileLoop(){
        do{
            System.out.println("Do while loops always run once regardless of condition");
        } while (1>2);

    }

    public static void advForLoop(){
        int[] numbers = {1, 2, 3, 4};
        for (int number: numbers) {
            System.out.println(number);
        }
    }

}
