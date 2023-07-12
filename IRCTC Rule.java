// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Abhilash is traveling by train and he comes to know about the new rule of IRCTC. The new rule of IRCTC says that the total sum of the weights of the bags that are carried by the goods train per person cannot exceed D kgs and the weight of the bag which is carried along with the person on the traveling train cannot exceed E kgs.
// Abhilash has 3 bags that he wants to take with him. They weigh A, B, and C kgS respectively. He wants to send exactly two of these bags by goods train and carry the remaining 1 bag with the same traveling train.
// Print(without quotes) "yes" if Abhilash is allowed to take all three bags otherwise print "no"
// Input
// The only line contains all 5 integers A, B, C, D, and E respectively.

// Constraints
// 1 ≤ A, B, C ≤10
// 15 ≤ D ≤ 20
// 5 ≤ E ≤ 10
// Output
// Print(without quotes) "yes" if Abhilash can take all three bags on the train or "no" if he cannot.
// Example
// Sample Input
// 1 1 1 15 5

// Sample output
// yes

// Explanation
// The chef can send the first and second bags by goods train(since 1 + 1 =2 <=15) and carry the third bag with him (since 1 ≤ 5).


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         try (Scanner scanner = new Scanner(System.in)) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            int E = scanner.nextInt();

            String result = canTakeAllBags(A, B, C, D, E);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String canTakeAllBags(int A, int B, int C, int D, int E) {
        if ((A + B <= D && C <= E) || (A + C <= D && B <= E) || (B + C <= D && A <= E)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
