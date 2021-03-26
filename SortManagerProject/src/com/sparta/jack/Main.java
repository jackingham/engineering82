package com.sparta.jack;

import com.sparta.jack.sort.BubbleSortClass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {};
	    if (array.length != 0) {
			System.out.println(Arrays.toString(new BubbleSortClass().sortArray(array)));
		}
	    else {
	    	System.out.println("Invalid array");
		}
    }
}
