import java.util.*;

class OneStone_or_TwoStone {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            long x = input.nextLong();
            long y = input.nextLong();
            if(x == y){
                if(x % 2 == 0){
                    System.out.println("CHEFINA");
                }else{
                    System.out.println("CHEF");
                }
            }else if(x > y){
                if(x - y >= 2){
                    System.out.println("CHEF");
                }else{
                    System.out.println("CHEFINA");
                }
            }else if(x < y){
                if(y - x <= 2){
                    System.out.println("CHEF");
                }else{
                    System.out.println("CHEFINA");
                }
            }else{
                System.out.println("CHEFINA");
            }
        }
    }
}