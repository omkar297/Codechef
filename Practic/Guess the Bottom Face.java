/*

It is known that in regular dice, the sum of opposite faces is 7.

A regular dice is rolled and you are given the value X showing on the top face. Determine the value on the bottom face.

Input Format
The first line will contain T - the number of test cases. Then the test cases follow.
The first and only of each test case contains a single integer X - the value on the top face.
Output Format
For each test case, output the value on the bottom face.

Constraints
1≤T≤6
1≤X≤6
Sample Input 1 
3
3
1
6
Sample Output 1 
4
6
1
Explanation
Test case-1: The value on the top face is 3. Therefore, the value on the bottom face is 4 because 3+4=7.

Test case-2: The value on the top face is 1. Therefore, the value on the bottom face is 6 because 1+6=7.

Test case-3: The value on the top face is 6. Therefore, the value on the bottom face is 1 because 6+1=7.

*/

import java.util.*;

class GuessBottomFace {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            while(testcase-- > 0){
                int x = input.nextInt();
                System.out.println(7 - x);
            }
        }
    }
}