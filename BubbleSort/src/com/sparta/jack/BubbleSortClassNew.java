package com.sparta.jack;
public class BubbleSortClassNew implements Sorter {

    public int[] sortArray(int[] numberArray){
        System.out.println(numberArray.toString());
        int passes=0 , swaps= 0;
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
                    swaps++;
                } else {
                    System.out.println(numberArray[i]+ " is not greater than "+ numberArray[i+1]);
                }
            }
            passes++;
        } while (hasSwapOccurred == true);
        System.out.println("Passes:"+passes);
        System.out.println("swaps:"+swaps);
        return numberArray;
    }
}

