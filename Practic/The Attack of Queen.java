/*

Chef has started developing interest in playing chess, and was learning how the Queen moves.

Chef has an empty N×N chessboard. He places a Queen at (X,Y) and wonders - What are the number of cells that are under attack by the Queen?

Notes:

The top-left cell is (1,1), the top-right cell is (1,N), the bottom-left cell is (N,1) and the bottom-right cell is (N,N).
The Queen can be moved any number of unoccupied cells in a straight line vertically, horizontally, or diagonally.
The cell on which the Queen is present, is not said to be under attack by the Queen.
Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers N, X and Y, as described in the problem statement.
Output Format
For each test case, output in a single line, the total number of cells that are under attack by the Queen.

Constraints
1≤T≤104
1≤N≤106
1≤X,Y≤N
Sample Input 1 
5
1 1 1
3 2 2
3 2 1
2 2 2
150 62 41
Sample Output 1 
0
8
6
3
527
Explanation
Test case 1: The only cell on the board is (1,1). Since Queen stands on this cell, it is not under attack.

Test case 2: The Queen can attack the following cells: {(1,1),(1,2),(1,3),(2,1),(2,3),(3,1),(3,2),(3,3)}.

Test case 3: The Queen can attack the following cells: {(1,1),(1,2),(2,2),(2,3),(3,1),(3,2)}.

Test case 4: The Queen can attack the following cells: {(1,1),(1,2),(2,1)}

*/



import java.util.*;

class AttackofQueen {
    static Scanner input = new Scanner(System.in);
    static int AttackQueen(int n,int x,int y){
        int count = 2 * n - 2;
        count += Integer.min(x - 1, n - y);
        count += Integer.min(x - 1, y - 1);
        count += Integer.min(n - x, n - y);
        count += Integer.min(n - x, y - 1);
        return count;
    }
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int n = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(AttackQueen(n, x, y));
        }
    }
}