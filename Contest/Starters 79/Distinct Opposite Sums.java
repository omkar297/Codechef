import java.util.*;

class DistinctOppositeSums {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int number = input.nextInt();
            for(int i = 1;i <= number / 2;i++){
                System.out.print(i+" ");
            }
            for(int i = number;i > number / 2;i--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}