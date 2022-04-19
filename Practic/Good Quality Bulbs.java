/*
A bulb company claims that the average lifetime of its bulbs is at least X units.

The company ran a test on N bulbs. You are given the lifetime of N−1 of these bulbs. What is the minimum non-negative integer value of lifetime the remaining bulb can have, such that the claim of the company holds true?

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains two integers N and X - denoting the number of test bulbs and the minimum average lifetime of bulbs in the company's claim.
The second line of each test case contains N−1 space-separated integers A1,A2,…,AN−1 denoting the lifetimes of N−1 of the test bulbs.
Output Format
For each testcase, output the minimum non-negative integer value of lifetime the remaining bulb can have such that the claim of the company holds true.

Constraints
1≤T≤100
2≤N≤100
0≤Ai≤1000
1≤X≤1000
Sample Input 1 
3
3 4
1 5
4 2
5 8 6
3 1000
0 0
Sample Output 1 
6
0
3000
 */

import java.util.*;

class GoodQualityBulbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        for(int i = 0;i < testcase;i++){
            int n = input.nextInt();
            int x = input.nextInt();
            int bulb = 0;
            int l_bulb = 0;
            for(int j = 0;j < n-1;j++){
                bulb = bulb + input.nextInt();
            }
            l_bulb = (x * n) - bulb;
            if(l_bulb < 0){
                System.out.println("0");
            }else{
                System.out.println(l_bulb);
            }
        }
    }
}