/*
MoEngage helps the Chef send email reminders about rated contests to the participants.

There are a total of N participants on Chef’s platform, and U of them have told Chef not to send emails to them.

If so, how many participants should MoEngage send the contest emails to?

Input Format
The first and only line of input will contain a single line containing two space-separated integers N (the total number of users) and U (the number of users who don't want to receive contest reminders).
Output Format
Output in a single line, the number of users MoEngage has to send an email to.

Constraints
1≤U<N≤105
Sample Input 1 
100 7
Sample Output 1 
93
Explanation
Out of 100 users, 7 do not want to receive reminders. Hence, MoEngage needs to send email to 93 users.
*/

import java.util.*;

class EmailReminders {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
                int u = input.nextInt();
                System.out.println(n - u);
        }
    }
}