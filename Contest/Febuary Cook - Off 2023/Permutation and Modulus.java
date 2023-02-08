import java.util.*;

class Permutation_and_Modulus {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int n = input.nextInt();
            for (int i = 2; i <= n; i++) {
                System.out.print(i+" ");
            }
            System.out.println(1);
        }
    }
}