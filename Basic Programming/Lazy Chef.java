/**
 * Chef is a very lazy person. Whatever work is supposed to be finished in x units of time, he finishes it in m∗x units of time. But there is always a limit to laziness, so he delays the work by at max d units of time. Given x,m,d, find the maximum time taken by Chef to complete the work.

Input:
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains a single line of input, three integers x,m,d.
Output:
For each testcase, output in a single line answer to the problem.

Constraints
1≤T≤104
1≤x,m≤10
0≤d<100
Sample Input 1 
3
1 1 0
1 3 1
2 2 3
Sample Output 1 
1
2
4
Explanation
TestCase 1: Chef takes 1∗1=1 unit of time which is equal to the upper bound(1+0=1 unit) to do the work.

TestCase 2: Chef takes min(1∗3,1+1)=min(3,2)=2 units of time to do the work.

TestCase 3: Chef takes 2∗2=4 units of time which is less than the upper bound(2+3=5 units) to do the work.
 */


import java.util.*;

class LazyChef {
    static int LAZYCHEF(int x,int m,int d){
        if(x == 0 || m == 0){ return 0; }
        int min1 = m * x;
        int min2 = x + d;
        if(min1 <= min2){
            return min1;
        }else{
            return min2;
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            for(int i = 0;i < testcase;i++){
                int x = input.nextInt();
                int m = input.nextInt();
                int d = input.nextInt();
                System.out.println(LAZYCHEF(x, m, d));
            }
        }
    }
}