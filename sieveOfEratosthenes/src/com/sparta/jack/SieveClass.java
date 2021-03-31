package com.sparta.jack;

public class SieveClass {

    public static boolean[] sieveOfEratosthenes(int upperBound) {

        boolean[] primeIndexArray = new boolean[upperBound + 1];
        for (int i = 0; i < upperBound+1; i++)
            primeIndexArray[i] = true;

        for (int n= 2; n* n<= upperBound; n++) {  //starts from 2 as 1 is a special case and not prime
            if (primeIndexArray[n]) {
                //System.out.println("Prime found:" +n+"\n");
                for (int j = n*n; j <= upperBound; j += n) {
                    primeIndexArray[j] = false;
                    //System.out.println(j+" is divisible by "+ n+" so is removed");
                    for (int i = 2; i <= upperBound; i++) {
                       // if (primeIndexArray[i])
                            //System.out.print(i + " ");
                    }
                    //System.out.println("\n");
                }
            }
        }
        return primeIndexArray;
    }
}
