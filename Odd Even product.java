// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a positive number N. You have to print the product of the sum of odd digits and even digits in the number.
// Input
// The first line of the input contains an integer N.

// Constraints
// 1 ≤ N ≤ 109
// Output
// Print the required product.
// Example
// Sample Input
// 241
// Sample Output
// 6
// Explanation
// The sum of odd digits=1.
// The sum of even digits = 2+4 = 6.
// Product= 1*6 = 6.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
         int oddSum =0;
         int evenSum = 0;

        while(N>0){
             int digit = N%10;

             if(digit%2==0){
                 evenSum +=digit;
             }else{
                 oddSum += digit;
             }

             N /= 10;
        }
        int product = oddSum*evenSum;
        System.out.println(product);

    }
}
