package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello world!");

        int caseBranch = 4;

        switch (caseBranch){
            case 1:
                Loops.forLoop();
                break;
            case 2:
                Loops.whileLoop();
                break;
            case 3:
                Loops.doWhileLoop();
                break;
            case 4:
                Loops.advForLoop();
                break;
        }

    }
}
