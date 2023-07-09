// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// A particular type of race competition is conducted in college to check the speed driving skill of the students. Two students are chosen at random named Ram and Shyam. Ram drives X kilometers in P hours and Shyam drives Y kilometers in Q hours.
// Determine who is driving faster, else, if they are both driving at the same speed print(without quotes) "Equal".
// Input
// The only line of the input contains all four integers X, P, Y, and Q respectively describes in the problem statement.

// Constraints
// 1 ≤ X, P, Y, Q ≤ 1000
// Output
// Print(without quotes) "Ram" if Ram's driving speed is more, print(without quotes) "Shyam" if Shyam's driving speed is more else print(without quotes) "Equal".
// Example
// Sample Input
// 20 4 30 10

// Sample Output
// Ram

// Explanation
// Ram drives 20 km in 4 hrs i.e 5kmph where as Shyam drives only 30 km in 10 hrs i.e. 3kmph
// Hence Ram's speed is more than Shyam's.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int P = scanner.nextInt();
        int Y = scanner.nextInt();
        int Q = scanner.nextInt();

        double ramSpeed = X / (double) P; 
        double shyamSpeed = Y / (double) Q; 

        if (ramSpeed > shyamSpeed) {
            System.out.println("Ram");
        } else if (shyamSpeed > ramSpeed) {
            System.out.println("Shyam");
        } else {
            System.out.println("Equal");
        }
    }
}
