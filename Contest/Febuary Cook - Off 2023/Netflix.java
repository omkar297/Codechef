import java.util.*;

class Netflix {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int x = input.nextInt();
            int ab = a + b;
            int ac = a + c;
            int bc = b + c;
            if(ab >= x){
                System.out.println("YES");
            }else if(ac >= x){
                System.out.println("YES");
            }else if(bc >= x){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
