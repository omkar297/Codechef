/*

An array A of length N is said to be pseudo-sorted if it can be made non-decreasing after performing the following operation at most once.

Choose an i such that 1≤i≤N−1 and swap Ai and Ai+1
Given an array A, determine if it is pseudo-sorted or not.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N - the size of the array A.
The second line of each test case contains N space-separated integers A1,A2,…,AN denoting the array A.
Output Format
For each testcase, output YES if the array A is pseudo-sorted, NO otherwise.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1≤T≤1000
2≤N≤105
1≤Ai≤109
Sum of N over all test cases do not exceed 2⋅105
Sample Input 1 
3
5
3 5 7 8 9
4
1 3 2 3
3
3 2 1
Sample Output 1 
YES
YES
NO
Explanation
Test case 1: The array is already sorted in non-decreasing order.

Test case 2: We can choose i=2 and swap A2 and A3. The resulting array will be [1,2,3,3], which is sorted in non-decreasing order.

Test case 3: It can be proven that the array cannot be sorted in non-decreasing order in at most one operation.

*/

import java.util.*;

class PseudoSorted{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        do{
            int count = 0;
            int n = input.nextInt();
            int a[] = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = input.nextInt();
            }
            for(int i = 0;i < n-1;i++){
                if(a[i]>a[i + 1])count++;
                if((i < n - 2) && a[i] > a[i + 2])count++;
                if(count > 1)break;
            }
            if(count > 1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }while(testcase-- > 1);
    }
}