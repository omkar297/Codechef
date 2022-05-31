/*

Problem
You are given a binary string AA of length NN.

You can perform the following type of operation on the string AA:

Choose two different indices ii and jj (1\leq i,j\leq N)(1≤i,j≤N);
Change A_iA 
i
​
  and A_jA 
j
​
  to A_i \oplus A_jA 
i
​
 ⊕A 
j
​
 . Here \oplus⊕ represents the bitwise XOR operation.
Find the minimum number of operations required to convert the given string into a palindrome.

Input Format
First line of the input contains TT, the number of test cases. Then the test cases follow.
First line of each test case contains an integer NN denoting the size of the string.
Second line of each test case contains a binary string AA of length NN containing 00s and 11s only.
Output Format
For each test case, print the minimum number of operations required to make the string a palindrome.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq N \leq 2 \cdot 10^51≤N≤2⋅10 
5
 
Sum of NN over all test cases does not exceeds 2 \cdot 10^52⋅10 
5
 .
Sample 1:
Input
Output
4
5
11011
7
0111010
1
1
4
1100
0
1
0
1
Explanation:
Test Case 11 : The given string 1101111011 is already a palindrome. So, no operation is required. The answer for the case is 00.

Test Case 22 : The given string 01110100111010 is not a palindrome.

Choose the indices i=3i=3 and j=5j=5. Now, A_3 \oplus A_5 = 1\oplus 0 = 1A 
3
​
 ⊕A 
5
​
 =1⊕0=1. Thus, we set A_3A 
3
​
  and A_5A 
5
​
  equal to 11.
After the operation, the resulting string is 01111100111110 which is a palindrome. The number of operations required is 11.

Test Case 33 : The given string 11 is already a palindrome. So, no operation is required. The answer for the case is 00.

Test Case 44 : The given string 11001100 is not a palindrome.

Choose the indices i=1i=1 and j=2j=2. Now, A_1 \oplus A_2 = 1\oplus 1 = 0A 
1
​
 ⊕A 
2
​
 =1⊕1=0. Thus, we set A_1A 
1
​
  and A_2A 
2
​
  equal to 00.
After the operation, the resulting string is 00000000 which is a palindrome. The number of operations required is 11.

*/

import java.util.*;

class XORPalindrome {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int n = input.nextInt();
            String a = input.next();
            int count = 0;
            for(int i = 0;i < n/2;i++){
                if(a.charAt(i) != a.charAt(n - i - 1)){
                    count++;
                }
            }
            System.out.println((count+1)/2);
        }
    }
}