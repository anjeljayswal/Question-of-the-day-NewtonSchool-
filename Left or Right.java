// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are standing on 0 on a number line. Your task is to reach N using a minimum number of moves. 
// In one move you can take 2 or 3 steps left or right from the current position.
// Input
// The first line of the input contains an integer N.

// Constraints
// 1 ≤ N ≤ 109
// Output
// Print the minimum number of moves required to reach N.
// Example
// Sample Input
// 1
// Sample Output
// 2
// Explanation
// At first, we take 2 steps left and reach the coordinate -2, 
// then from there we take 3 steps to the right and we reach -2+3 = 1(=N). Therefore we can reach 1 from 0 using 2 steps which are the minimum possible.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n/3;
        n%=3;
        if(n==1){
            if(ans==0)
                System.out.println(2);
            else
                System.out.println(ans+1);
        }else if(n==2)
            System.out.println(ans+1);
        else
            System.out.println(ans);
    }
}
