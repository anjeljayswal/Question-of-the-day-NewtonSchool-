// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a number N. You have to print "8" S times where S is the sum of odd digits in the number N.
// It is guaranteed that there will be at least one odd digit in the number N.
// Input
// The first line of the input contains an integer N.

// Constraints
// 1 ≤ N ≤ 109
// Output
// Print "8" the required number of times.
// Example
// Sample Input
// 423
// Sample Output
// 888
// Explanation
// The sum of the odd digits = 3, therefore you have to print 8 thrice.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String strN = String.valueOf(N);
        int sum = 0;

        for (int i = 0; i < strN.length(); i++) {
            int digit = strN.charAt(i) - '0';
            if (digit % 2 != 0) {
                sum += digit;
            }
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < sum; i++) {
            output.append("8");
        }

        System.out.println(output.toString());
    }
}
