import java.util.*;

class BetterDeal {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws java.lang.Exception {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int disA = input.nextInt();
            int disB = input.nextInt();
            disA = (disA * 100)/100;
            disB = (disB * 200)/100;
            int a = 100 - disA;
            int b = 200 - disB;
            if(a > b){
                System.out.println("SECOND");
            }else if (a < b){
                System.out.println("FIRST");
            }else{
                System.out.println("BOTH");
            }
        }
    }
}