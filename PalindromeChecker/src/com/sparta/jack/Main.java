package com.sparta.jack;

public class Main {

    public static void main(String[] args) {
        String stringToCheck = null;
        if (stringToCheck != null && stringToCheck.length() >= 3) {
            if (Palindrome.palindromeChecker(stringToCheck.toLowerCase(), 0, stringToCheck.length() - 1)) {
                System.out.println(stringToCheck + " is a palindrome");
            } else {
                System.out.println(stringToCheck + " is not a palindrome");

            }
        } else {
            System.out.println("invalid string");
        }
    }
}