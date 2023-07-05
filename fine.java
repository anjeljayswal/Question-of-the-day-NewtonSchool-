// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There are a total of N passengers traveling in a train. Out of them, only X has a valid ticket for the journey, Calculate the total fine that will be collected from this train if each person who doesn't have a ticket will have to pay a fine of Rs. K.
// Input
// The first line of the input contains three space-separated integers N, X, and K.

// Constraints
// 1 ≤ X ≤ N ≤ 100
// 1 ≤ K ≤ 100
// Output
// Print a single integer denoting the total fine collected from the train.
// Example
// Sample Input
// 4 1 1
// Sample Output
// 3
// Explanation
// No. of passengers who don't have a ticket = 4 - 1=3.
// Total fine= 3*1 = 3.


// Solution

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int x = scanner.nextInt(); 
        int k = scanner.nextInt();
        int passengersWithoutTicket = n - x;
        int fine = passengersWithoutTicket * k;        
        System.out.println(fine);
    }    
   
}