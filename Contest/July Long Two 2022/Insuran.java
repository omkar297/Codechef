import java.util.*;

class Insurance{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int x = input.nextInt();
            int y = input.nextInt();
            if(x <= y){
                System.out.println(x);
            }else if(x >= y){
                System.out.println(y);
            }
        }
    }
}