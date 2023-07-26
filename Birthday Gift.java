// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Rahul and Raunak are best friends, and today is Raunak's birthday. Rahul wants to give Raunak a Rolex watch as a gift. Given the amount of money Rahul has and the price of the Rolex watch, represented by 'n' and 'm' respectively, determine if it is possible for Rahul to afford the watch and gift it to Raunak.
// Input
// The first line of input contains two space separated integers n and m.

// Constraints:-
// 1 ≤ n, m ≤ 1000
// Output
// Print true if it is possible for Rahul to gift a Rolex watch to raunak, otherwise false.
// Example
// Sample Input 1:
// 16 8

// Sample Output 1:
// true

// Explanation 1:
// Since he has money sufficient to but the watch, therefore true.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(m <= n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
