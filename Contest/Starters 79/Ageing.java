import java.util.*;

class Ageing {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int nextAge = input.nextInt();
            int sub = nextAge - 20;
            System.out.println(sub + 10);
        }
    }
}