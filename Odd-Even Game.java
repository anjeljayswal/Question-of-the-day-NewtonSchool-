// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Rahul and Abhilash are playing a game. They are given a number N at the beginning and both in their turn have to choose a number X such that
// 1 ≤ X ≤ N
// If its Rahul's turn, X has to be even, but if its Abhilashs' turn, it has to be odd
// After each turn, N becomes N - X. The player who is not able to choose any number in his turn loses. Find out who wins, if both play optimally and Rahul starts the game.
// Input
// The first line of the input contains a single integer N.

// Constraints
// 1 ≤ N ≤ 109
// Output
// Print "Rahul" if he wins else print "Abhilash".
// Example
// Sample Input
// 2

// Sample Output
// Rahul

// Explanation
// Rahul chooses 2 and subtracts it from N. In Abhilashs' turn N is 0 and there is no odd positive integer less than 0, so he loses.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Check if N is even or odd
        if (N % 2 == 0) {
            // If N is even, Rahul wins
            System.out.println("Rahul");
        } else {
            // If N is odd, Abhilash wins
            System.out.println("Abhilash");
        }
    }
}
