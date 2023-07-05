// Make it N rupees
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You have unlimited coins worth Rs. 2 and Rs. X. Can you pick some coins that sum to Rs. N? In simple words,
//   can u pick A coins of Rs. 2 and B coins of Rs. X such that A* 2 + B * X = N? (A and B are non-negative integers)
// Input
// The first line of the input contains two space-separated integers N and X.

// Constraints
// 1 ≤ X ≤ N ≤ 1018
// Output
// Print Yes if it is possible to make N rupees else print No.
// Example
// Sample Input
// 5 3
// Sample Output
// Yes
// Explanation
// You can pick one 2 rupee coin and one 3 rupee coin, 2 + 3 = 5 (=N).


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); 
        long x = scanner.nextLong(); 
        String result = isPossible(n, x);
        System.out.println(result);
    }
    
    private static String isPossible(long n, long x) {       
        if (n % 2 == 0) {
            return "Yes";
        }       
        
        if ((n - x) % 2 == 0 && (n - x) >= 0) {
            return "Yes";
        }
        
        return "No";
    }
}
