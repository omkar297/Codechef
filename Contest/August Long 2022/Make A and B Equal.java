import java.util.*;

class MakeAandBEqual {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int a = input.nextInt();
            int b = input.nextInt();
            if(a == b){
                System.out.println("YES");
            }else if(a > b){
                for(int i = 0;i <= 5;i++){
                    b = b*2;
                    if(a == b){
                        System.out.println("YES");
                        break;
                    }else if(a < b){
                        System.out.println("NO");
                        break;
                    }
                }
            }else{
                for(int i = 0;i <= 5;i++){
                    a = a*2;
                    if(a == b){
                        System.out.println("YES");
                        break;
                    }else if(a > b){
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }
    }
}