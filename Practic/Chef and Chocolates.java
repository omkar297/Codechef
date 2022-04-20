/*
Chef wants to gift C chocolates to Botswal on his birthday. However, he has only X chocolates with him.
The cost of 1 chocolate is Y rupees.

Find the minimum money in rupees Chef needs to spend so that he can gift C chocolates to Botswal.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers C,X, and Y.
Output Format
For each test case, output in a single line answer, the minimum money in rupees Chef needs to spend.

Constraints
1≤T≤100
1≤C≤100
0≤X≤C
1≤Y≤100
Sample Input 1 
2
7 5 5
10 1 1
Sample Output 1 
10
9
Explanation
Test Case 1: Chef has to gift a total of 7 chocolates out of which he has 5 chocolates. Thus, Chef needs to buy 2 more chocolates, which costs him 10 rupees.

Test Case 2: Chef has to gift a total of 10 chocolates out of which he has 1 chocolate. Thus, Chef needs to buy 9 more chocolates, which costs him 9 rupees.
*/

import java.util.*;

class ChefandChocolates {
    static int ChefChocolates(int c,int x,int y){
        int reqChocolates = c - x;
        return reqChocolates * y;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            do{
                int c = input.nextInt();
                int x = input.nextInt();
                int y = input.nextInt();
                System.out.println(ChefChocolates(c, x, y));
                testcase--;
            }while(testcase > 0);
        }
    }
}