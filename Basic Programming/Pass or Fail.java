import java.util.*;

class PassFail{
    static String Pass(int n,int x,int p){
        if(n <= 0){
            return "FAIL";
        }
        int nWrong = n - x;
        x *=3;
        int sum = x - nWrong;
        if(sum >= p){
            return "PASS";
        }
        return "FAIL";
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            int nQue = 0;
            int nCorect = 0;
            int pMarks = 0;
            if(testcase == 1){
                nQue = input.nextInt();
                nCorect = input.nextInt();
                pMarks = input.nextInt();
                System.out.println(Pass(nQue, nCorect, pMarks));
            }else{
                for(int i = 0;i < testcase;i++){
                    nQue = input.nextInt();
                    nCorect = input.nextInt();
                    pMarks = input.nextInt();
                    System.out.println(Pass(nQue, nCorect, pMarks));
                }
            }
        }
    }
}