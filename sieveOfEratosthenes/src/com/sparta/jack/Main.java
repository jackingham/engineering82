package com.sparta.jack;


public class Main {

    public static void main(String[] args) {
        int upperBound = 5000;
        boolean[] booleanArray = SieveClass.sieveOfEratosthenes(upperBound);
        System.out.println("Final number list");
        for (int i = 2; i <= upperBound; i++) { //starts from 2 as 1 is a special case and not prime
            if (booleanArray[i])
                System.out.print(i + " ");
        }
    }
}






