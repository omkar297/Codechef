import java.util.*;

class SumofProduct1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int n = input.nextInt();
            long count = 0;
            long a = 0;
            for(int i = 0;i < n;i++){
                int temp = input.nextInt();
                if(temp == 1){
                    count++;
                }else{
                    a += (count * (count + 1))/2;
                    count = 0;
                }
            }
            a += (count * (count + 1) / 2);
            System.out.println(a);
        }
    }
}