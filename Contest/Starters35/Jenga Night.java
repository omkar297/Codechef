import java.util.*;

class JengaNight {
    static void JN(int n,int x){
        if(x % n == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            while(testcase-- > 0){
                int n = input.nextInt();
                int x = input.nextInt();
                JN(n, x);
            }
        }
    }
}