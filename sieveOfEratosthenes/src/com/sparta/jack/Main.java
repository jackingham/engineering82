package com.sparta.jack;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter upper bound");
        int upperBound = myScanner.nextInt() - 1;
        int[] primeArray = new int[upperBound];
        for(int i = 0; i < primeArray.length; i++)
            primeArray[i] = i+2;
        System.out.println(Arrays.toString(primeArray));

        for (int j = 0; j < primeArray.length; j|++){
            if (primeArray[j] % primeArray[k] =! 0){

            }

        }



    }
}
