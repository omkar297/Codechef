import java.util.*;

class WaterReq{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            while(testcase-- > 0){
                int n = input.nextInt();
                System.out.println(n * 2);
            }
        }
    }
}