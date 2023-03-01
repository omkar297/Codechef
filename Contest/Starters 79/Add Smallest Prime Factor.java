import java.util.*;

class AddSmallestPrimeFactor {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int x = input.nextInt();
            int y = input.nextInt();
            int primeFactor;
            if(x % 2 == 0){
                primeFactor = 2;
            }else if(x % 3 == 0){
                primeFactor = 3;
            }else{
                primeFactor = x;
            }
            x = x + primeFactor;
            int dif = y - x;
            int ans = dif /2;
            if(dif % 2 != 0){
                ans += 1;
            }
            System.out.println(ans + 1);
        }
    }
}