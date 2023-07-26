// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given three integers a, b, and c. Your task is to find out if you can choose two integers such that their sum is odd.
// Input
// The first line of the input contains three space-separated integers denoting a, b, and c
// Constraints
// 1 ≤ a, b, c ≤ 100
// Output
// Print YES if you can choose two integers such that their sum is odd else print NO.
// Example
// Sample Input
// 70 25 26

// Sample Output
// YES

// Explanation
// You can choose 25 and 26.
// 25 + 26 = 51. (odd)


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a+b)%2 != 0 || (b+c)%2 != 0 || (a+c)%2 != 0){
            System.out.println("YES");

        }else{
            System.out.println("NO");
        }
    }
}
