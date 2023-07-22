// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Rahul has n coins worth 1 rupee each, and he has m friends. He wants to distribute an equal number of coins to each of his friends. Determine whether it is possible for Rahul to distribute the coins equally among all his friends or not.
// Input
// The first line of input contains two space- separated integers n and m.

// Constraints:-
// 1 ≤ n, m ≤ 1000
// Output
// Print true if it is possible for Rahul to distribute the coins equally among all his friends, otherwise false.
// Example
// Sample Input 1:
// 16 8

// Sample Output 1:
// true

// Explanation 1:
// Since he has the capability to distribute 2 coins to each of his friends, therefore true.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of coins Rahul has
        int m = sc.nextInt(); // Number of friends

        boolean possible = isDistributionPossible(n, m);
        System.out.println(possible);
    }

    public static boolean isDistributionPossible(int n, int m) {
        // Check if n is divisible by m without any remainder
        return n % m == 0;
    }
}
