// Birthday Party
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Abhilash has his birthday next month. He is thinking of a party for his N friends. He went to his nearby cake shop to buy cakes for his friends. Each cake has exactly K slices. Abhilash's friends get sad if one gets more slices than the other. Also, Abhilash gets unfortunate if there are some cake slices left as he never wants to waste food.

// Help Abhilash to find the minimum number of Cakes he has to buy to share all the slices among his friends so that neither of his friends nor he gets sad. Note that Abhilash hates Cakes and doesn't take any slices.
// Input
// The only line of the input contains two space-separated integers N and K where N is the number of the Abhilash's friends and K is the number of slices per cake.

// Constraints
// 1 ≤ N, K ≤ 109
// Output
// Print the minimum number of Cakes Abhilash has to buy to share among his friends so that neither his friends nor he gets sad.
// Example
// Sample Input
// 2 3

// Sample Output
// 2

// Explanation
// One cake has 3 slices. And there are 2 friends. So Abhilash can't share one cake without being left out with a slice. So he needs to buy at least 2 Cakes. And if he buys 2 Cakes he can give 3 slices to one friend and 3 to another. So the minimum number of Cakes Abhilash needs to buy is equal to 2.

#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
int main() {
    long long k2, k3;
    cin >> k2 >> k3;
    long long k4 = 0;
    if (k2 % 2 == 0 && k3 % 2 != 0) {
        k4 = (k2 * k3) / k3;
    } else {
        k4 = (k2 + k3 - 1) / k3;
    }
    cout << k4 << endl;
    return 0;
}
