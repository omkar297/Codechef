import java.util.*;

class BobattheBank {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int cBalance = input.nextInt();
            int deposit = input.nextInt();
            int deducted = input.nextInt();
            int month = input.nextInt();
            System.out.println(cBalance + ( deposit - deducted ) * month);
        }
    }
}