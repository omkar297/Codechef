import java.util.*;

class ChefandWireFrames {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int length = input.nextInt() * 2;
            int hight = input.nextInt() * 2;
            int costCm = input.nextInt();
            int area = length + hight;
            int totalCost = area * costCm;
            System.out.println(totalCost);
        }
    }
}