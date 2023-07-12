// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given two numbers N and M. In one step you can multiply N with 2 or 3. Find the number of steps required to convert N to M. If it is impossible to convert N to M, print -1.
// Input
// The first line of the input contains a single integer N.

// Constraints
// 1 ≤ N, M ≤ 109
// Output
// Print the number of steps required to convert N to M, if it is not possible print -1.
// Example
// Sample Input
// 13 78
// Sample Output
// 2
// Explanation
// One of the possible ways can be 13 * 2 = 26 * 3= 78. (2 steps)


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int steps = convertNumbers(N, M);

        System.out.println(steps);
    }

    private static int convertNumbers(int N, int M) {
        if (M < N) {
            return -1;
        }

        if (M % N != 0) {
            return -1;
        }

        int steps = 0;
        int quotient = M / N;

        while (quotient % 2 == 0) {
            quotient /= 2;
            steps++;
        }

        while (quotient % 3 == 0) {
            quotient /= 3;
            steps++;
        }

        if (quotient != 1) {
            
            return -1;
        }

        return steps;
    }
}
