import java.util.*;

class BatteryHealth {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int x = input.nextInt();
            if(x < 80){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}