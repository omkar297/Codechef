/*
There is a group of N friends who wish to enroll in a course together. The course has a maximum capacity of M students that can register for it. If there are K other students who have already enrolled in the course, determine if it will still be possible for all the N friends to do so or not.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
Each test case consists of a single line containing three integers N, M and K - the size of the friend group, the capacity of the course and the number of students already registered for the course.
Output Format
For each test case, output Yes if it will be possible for all the N friends to register for the course. Otherwise output No.

You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).

Constraints
1≤T≤1000
1≤N≤M≤100
0≤K≤M
Sample Input 1 
3
2 50 27
5 40 38
100 100 0
Sample Output 1 
Yes
No
Yes
Explanation
Test Case 1: The 2 friends can enroll in the course as it has enough seats to accommodate them and the 27 other students at the same time.

Test Case 2: The course does not have enough seats to accommodate the 5 friends and the 38 other students at the same time.
*/

import java.util.*;

class CourseRegistration {
    static String CourceR(int friend,int max,int enrol){
        if((friend + enrol) <= max){
            return "YES";
        }else{
            return "NO";
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            while(testcase > 0){
                int friend = input.nextInt();
                int max = input.nextInt();
                int enrol = input.nextInt();
                System.out.println(CourceR(friend, max, enrol));
                testcase--;
            }
        }
    }
}