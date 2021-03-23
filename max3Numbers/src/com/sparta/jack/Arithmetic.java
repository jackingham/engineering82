package com.sparta.jack;

public class Arithmetic {
    public static int getMaxNumber(int numberOne, int numberTwo, int numberThree) {
        if (numberOne > numberTwo && numberOne > numberThree) {
            return numberOne;
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            return numberTwo;
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            return numberThree;
        } else {
            return 0;
            //default return if there is some sort of failure
        }
    }
}

