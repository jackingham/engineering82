package com.sparta.jack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the nth fibonacci number you want to go up to:");
        int upperBound = myScanner.nextInt();
	    for (int i =1; i < upperBound+1; i++){
	        System.out.println(FibonacciClass.fibonacci(i));
        }
    }
}
