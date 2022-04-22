import java.util.*;

class ATMMachine {
    static Scanner input = new Scanner(System.in);
    static void ATM_Machine(int k,int a[]){
        String ans = "";
        for(int i = 0;i < a.length;i++){
            if(a[i] <= k){
                k -= a[i];
                ans += "1";
            }else{
                ans += "0";
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int n = input.nextInt();
            int k = input.nextInt();
            int a[] = new int[n];
            for(int i = 0;i < a.length;i++){
                a[i] = input.nextInt();
            }
            ATM_Machine(k, a);
        }
    }
}