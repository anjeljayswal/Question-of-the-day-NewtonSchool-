// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given that Raunak has n rupees and the ticket for the swing costs m rupees, determine whether or not he can afford to ride the swing.
// Input
// The first line of input contains two space-separated integers n and m.

// Constraints:-
// 1 ≤ n, m ≤ 1000
// Output
// Print true if raunak can ride the swing, otherwise false.
// Example
// Sample Input 1:
// 9 8

// Sample Output 1:
// true

// Explanation 1:
// Since he has 9 rupees and the swing fare is 8 rupees, he has enough money to ride the swing.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Raunak's money
        int m = sc.nextInt(); // Swing ticket fare

        boolean canRide = canAffordRide(n, m);
        System.out.println(canRide);
    }

    public static boolean canAffordRide(int n, int m) {
        // Check if Raunak's money is greater than or equal to the ticket fare
        return n >= m;
    }
}
