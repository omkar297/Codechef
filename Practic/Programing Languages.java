import java.util.*;

class ProgramingLanguages {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int a = input.nextInt();
            int b = input.nextInt();
            int a1 = input.nextInt();
            int b1 = input.nextInt();
            int a2 = input.nextInt();
            int b2 = input.nextInt();
            if(a == a1 || a == b1){
                if(b == a1 || b == b1){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(a == a2 || a == b2){
                if(b == a2 || b == b2){
                    System.out.println(2);
                }else{
                    System.out.println(0);
                }
            }else{
                System.out.println(0);
            }
        }
    }
}