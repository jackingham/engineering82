package com.sparta.jack;
public class BubbleSortClass implements Sorter {

    public int[] sortArray(int[] numberArray){
        System.out.println(numberArray.toString());
        int passes=0 , swaps= 0;
        boolean hasSwapOccurred;
        do {
            hasSwapOccurred = false;
            for (int i=0; i < numberArray.length-1; i++){
                //Printer.printMessage("Comparing "+numberArray[i]+ " and "+ numberArray[i+1]);
                if (numberArray[i] > numberArray[i+1]){
                    //Printer.printMessage(numberArray[i]+ " is greater than "+ numberArray[i+1]);
                    int holderVar = numberArray[i];
                    numberArray[i] = numberArray[i+1];
                    numberArray[i+1] = holderVar;
                    hasSwapOccurred = true;
                    swaps++;
                } else {
                    //Printer.printMessage(numberArray[i]+ " is not greater than "+ numberArray[i+1]);
                }
            }
            passes++;
        } while (hasSwapOccurred == true);
        //Printer.printMessage("Passes:"+passes);
        //Printer.printMessage("swaps:"+swaps);
        return numberArray;
    }
}

