// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// The playful pandas, Kiki and Milo, engage in a similar candy- eating game. Kiki starts by eating 1 candy, followed by Milo eating 2 candies. The pattern continues as Kiki eats 3 candies, Milo eats 4 candies, and so forth. The winner is determined by the first player who reaches their candy- eating limit without getting sick.
// If Kiki can consume a maximum of A candies overall without falling ill, while Milo's candy limit is set at B candies, we can determine the game's outcome. Let's find out who will emerge victorious: Kiki or Milo.
// Input
// The only line of each test case contains two integers A and B denoting the maximum possible number of candies Kiki can eat and the maximum possible number of candies Milo can eat respectively.

// Constraints
// 1 ≤ A, B ≤ 1000
// Output
// For each test case, output a single line containing one string — the name of the winner ("Kiki" or "Milo" without the quotes).
// Example
// Sample Input
// 3 2

// Sample Output
// Milo

// Explanation
// We have A = 3 and B = 2. Kiki eats 1 candy first, and then Milo eats 2 candies. Then Kiki is supposed to eat 3 candies but that would mean 1 + 3 = 4 candies in total. It's impossible because he can eat at most A candies, so he loses. Milo wins, and so we print "Milo".



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int i = 1, j = 2;
        while(a>=i && b>=j){
            a-=i;
            i+=2;
            b-=j;
            j+=2;
        }
        if(a-i<0)
            System.out.println("Milo");
        else
            System.out.println("Kiki");
    }
}
