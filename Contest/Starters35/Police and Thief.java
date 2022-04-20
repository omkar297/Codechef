import java.util.*;

class PoliceThief {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            while(testcase-- > 0){
                int x = input.nextInt();
                int y = input.nextInt();
                if(x < y){
                    System.out.println(y - x);
                }else if(x > y){
                    System.out.println(x - y);
                }else{
                    System.out.println("0");
                }
            }
        }
    }
}