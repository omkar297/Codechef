import java.util.*;

class To_Divide_or_Not_To_Divide {
    static Scanner input = new Scanner(System.in);
    static int Divide(int a,int b,int n){
        if(a % b == 0){
            return -1;
        }
        int count = n;
        if(count % a != 0){
            count = n + a - (count % a);
        }
        while (!((count % a == 0) & (count % b) != 0)){
            count += a;
        }
        return count;
    }
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            System.out.println(Divide(a, b, n));
        }
    }
}