// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a positive number N (without leading zeroes). You have to print the number in Word form. For eg. 1234 should be printed as "one two three four". You have to print it from left to right if the number is even else you have to print it from right to left.
// Input
// The first line of the input contains a single integer N.
// Constraints
// 1 ≤ N ≤ 1012
// Output
// Print the required answer.
// Example
// Sample Input
// 241
// Sample Output
// one four two
// Explanation
// Since the number is odd, we have to print it from right to left.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();

        String numberString = String.valueOf(N);
        int length = numberString.length();

        if (N % 2 == 0) {
            // Print from left to right
            for (int i = 0; i < length; i++) {
                char digit = numberString.charAt(i);
                System.out.print(getWordForm(digit) + " ");
            }
        } else {
            // Print from right to left
            for (int i = length - 1; i >= 0; i--) {
                char digit = numberString.charAt(i);
                System.out.print(getWordForm(digit) + " ");
            }
        }
    }

    // Helper method to get word form of a single digit
    private static String getWordForm(char digit) {
        switch (digit) {
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            default:
                return "";
        }
    }
}
