import java.util.*;

class MaximumSub{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int min = input.nextInt();
            System.out.println(min * 2);
        }
    }
}