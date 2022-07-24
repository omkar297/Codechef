import java.util.*;

class Maximize_Difference {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int n = input.nextInt();
            int m = input.nextInt();
            int ans1 = 0,ans2 = 0;
            if(m < ( 2 * n )){
                System.out.println(m +" "+ m);
            }else if(m >= (2 * n) && m % n == 0){
                System.out.println(m +" "+ n);
            }else{
                int x = m / 2;
                if(m >= 2 * n){
                    x = 2 * n;
                }
                int dif = Integer.MIN_VALUE;
                for(int i = n;i <=x;i++){
                    int d = m / i;
                    int cDif = (i * d) - i;
                    if(cDif > dif){
                        ans1 = i;
                        ans2 = (i * d);
                        dif = cDif;
                    }
                }
                System.out.println(ans1+" "+ans2);
            }
        }
    }
}