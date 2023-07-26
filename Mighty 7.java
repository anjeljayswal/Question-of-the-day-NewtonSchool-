// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// 7 is Abhilash's favorite number. On his birthday his friend gives him an integer and she wants him to count the number of occurrences of 7 in that integer.
// Help Abhilash to count.
// Input
// The only line contains an integer.
// Output
// Print the count of 7.

// Constraints
// 1 ≤ integer ≤ 231-1
// Example
// Sample Input
// 737329

// Sample Output
// 2

// Explanation
// There are 2 7's in the given example.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         String numberStr = String.valueOf(n);

         int count = 0;

         for(int i=0; i<numberStr.length(); i++){
             if(numberStr.charAt(i) == '7'){
                 count++;
             }
         }
         System.out.println(count);
    }
}
