import java.util.*;

class PairPain{
    static Scanner input = new Scanner(System.in);
    static long Pairpain(int n,int a[]){
        long count = 0;
        int c1 = 0,c2 = 0;
        for(int i = 0;i < n;i++){
            if(a[i] == 1){
                c1++;
            }else if(a[i] == 2){
                c2++;
            }
        }
        count = c1 * (n - c1) + c1 * (c1 - 1) / 2 + c2 * (c2 - 1) / 2;
        return count;
    }
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int n = input.nextInt();
            int a[] = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = input.nextInt();
            }
            System.out.println(Pairpain(n, a));
        }
    }
}