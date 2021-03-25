package com.sparta.jack;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        int upperBound = 100;
        boolean[] booleanArray = SieveClass.sieveOfEratosthenes(upperBound);
        System.out.println("Final number list");
        for (int i = 2; i <= upperBound; i++) {
            if (booleanArray[i] == true)
                System.out.print(i + " ");
        }
    }
}






