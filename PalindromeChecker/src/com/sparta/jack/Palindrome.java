package com.sparta.jack;

public class Palindrome {
    public static boolean palindromeChecker(String text, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return true;
        }
        if ((text.charAt(startIndex)) != (text.charAt(endIndex))) {
            return false;
        }
        if (startIndex < endIndex + 1) {
            return palindromeChecker(text, startIndex + 1, endIndex - 1);
        }

        return true;
    }
}
