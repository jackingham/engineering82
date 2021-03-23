package com.sparta.jack;
public class BubbleSortClassNew {
    public static int[] bubbleSort(int[] numberArray){
        boolean isLoopSorted = false;
        System.out.println(numberArray.toString());
        int passes = 0;
        boolean hasSwapOccurred;
        do {
            hasSwapOccurred = false;
            for (int i=0; i < numberArray.length-1; i++){
                System.out.println("Comparing "+numberArray[i]+ " and "+ numberArray[i+1]);
                if (numberArray[i] > numberArray[i+1]){
                    System.out.println(numberArray[i]+ " is greater than "+ numberArray[i+1]);
                    int holderVar = numberArray[i];
                    numberArray[i] = numberArray[i+1];
                    numberArray[i+1] = holderVar;
                    hasSwapOccurred = true;
                } else if(numberArray[i] < numberArray[i+1]){
                    System.out.println(numberArray[i]+ " is not greater than "+ numberArray[i+1]);
                }
            }
            passes++;
        } while (hasSwapOccurred == true);
        System.out.println("Passes:"+passes);
        return numberArray;
    }
}

