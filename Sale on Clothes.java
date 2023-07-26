// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Abhilash opened a clothes shop but due to the global recession in the market, there is less demand for clothes. Being a business- minded Abhilash knew that when people see a discount offered on a product, they are more likely to buy it. Therefore, he decides to first increase the price of these clothes by x%(from p i. e original price) and then offer a discount of x% to people.
// Please help Abhilash find the total loss incurred due to this sale, if all the q clothes are sold out.

// Note
// The test cases are designed in such a way that you don't need to worry about decimal. You just have to care about integer values.
// Input
// The only line contains the three space- separated integers denoting the original price(p), quantity(q) and discount%(x) of the clothes.

// Constraints
// 1 ≤ p, q ≤ 100
// 0 ≤ x ≤ 100
// Output
// Print the total amount of money loss.
// Example
// Sample Input
// 100 5 10

// Sample Output
// 5

// Explanation
// Abhilash first increases the price of each cloth by 10%, from 100 to 110. After that, he decreases the price by 10%,
//   which makes the final price 99. The amount of money lost for each unit is 1, thus there are 5 items so total loss = 5*1=5



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);


        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int x = scanner.nextInt();

        // Calculate the price after increasing it by x%
        int increasedPrice = p + (p * x / 100);

        // Calculate the price after offering a discount of x% on the increased price
        int finalPrice = increasedPrice - (increasedPrice * x / 100);

        // Calculate the loss per item
        int lossPerItem = p - finalPrice;

        // Calculate the total money loss
        int totalLoss = lossPerItem * q;

        // Print the total amount of money loss
        System.out.println(totalLoss);
    }
}
