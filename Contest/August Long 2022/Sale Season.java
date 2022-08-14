import java.util.*;

class SaleSeason {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int rupy = input.nextInt();
            if(rupy <= 100){
                System.out.println(rupy);
            }else if(rupy > 100 && rupy <= 1000){
                System.out.println(rupy - 25);
            }else if(rupy > 1000 && rupy <= 5000){
                System.out.println(rupy - 100);
            }else if(rupy > 5000){
                System.out.println(rupy - 500);
            }
        }
    }
}