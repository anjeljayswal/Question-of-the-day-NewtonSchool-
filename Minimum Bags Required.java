// Time Limit: 2 sec, Memory Limit: 128000 kB
// You are given n bags, where the ith bag has weight capacity wt[i]. There is a total weight W that needs to be carried. Your task is to determine the minimum number of bags required to carry the total weight. If we cannot carry the weight using these bags, print -1.
// Input
// The input consists of two lines:

// The first line contains an integer- n: the number of bags available, W: the total weight that needs to be carried.
// The second line contains n integers separated by spaces, representing the weight capacities of the bags.

// Constraints
// 1 <= n <= 105
// 1 <= W <= 109
// 1 <= wt[i] <= 105
// Output
// Print an integer, the minimum number of bags required to carry the total weight W.
// Example
// Input:

// 3 5
// 2 1 3

// Output:

// 2

// Explanation:

// We only need bag 1 and bag 3 to store the total weight 5.
// Hence the output is
// 2.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt();
        int W = sc.nextInt();
        int[] wt = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }

        // Sort the bags by weight capacity in descending order
        Arrays.sort(wt);
        int bagsRequired = 0;
        int remainingWeight = W;

        // Iterate through the bags in descending order
        for (int i = n - 1; i >= 0; i--) {
            if (remainingWeight <= 0) {
                break; // No need to check further
            }

            if (wt[i] >= remainingWeight) { // Check if the bag can carry the remaining weight
                bagsRequired++;
                remainingWeight = 0; // All remaining weight is carried
            } else {
                bagsRequired++;
                remainingWeight -= wt[i];
            }
        }

        // Check if all weight was carried
        if (remainingWeight == 0) {
            System.out.println(bagsRequired);
        } else {
            System.out.println(-1); // Cannot carry the weight
        }
    }
}
