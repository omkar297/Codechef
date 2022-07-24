import java.util.Scanner;

class ChefinhisOffice {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(((x*4)+y));
        }
    }
}