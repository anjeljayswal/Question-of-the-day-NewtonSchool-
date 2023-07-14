// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given two numbers, n and m. Your task is to transform n into m using the minimum number of operations. There are two operations available: either add 2 to n or add 1 to n in a single operation.
// Input
// The first line of input contains two space-separated integers n and m.

// Constraints:-
// 1 ≤ n ≤ m ≤ 1000
// Output
// Print the minimum number of operations.
// Example
// Sample Input 1:
// 8 10

// Sample Output 1:
// 1

// Explanation 1:
// Only 1 operation of adding 2 to n is needed.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int operations = 0;

        while (n != m) {
            if (n + 2 <= m) {
                n += 2;
            } else {
                n += 1;
            }
            operations++;
        }
        System.out.println(operations);

    }
}
