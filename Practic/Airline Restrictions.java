import java.util.*;

class AirlineRestrictions {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
            if(a <= e && (b + c) <= d){
                System.out.println("YES");
            }else if(b <= e && (a + c) <= d){
                System.out.println("YES");
            }else if(c <= e && (a + b) <= d){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}