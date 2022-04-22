import java.util.*;

class PalindromePain {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            while(testcase-- > 0){
                int x = input.nextInt();
                int y = input.nextInt();
                int ca1 = 0,ca2 = 0,cb1 = 0,cb2 = 0;
                int n = x + y;
                char ans1[] = new char[n];
                char ans2[] = new char[n];
                if(x == 1 || y == 1 || (x % 2 == 1 && y % 2 == 1)){
                    System.out.println(1);
                }else{
                    ca1 = x;
                    ca2 = x;
                    cb1 = y;
                    cb2 = y;
                    for(int i = 0;i < n / 2;i++){
                        if(ca1 > 2){
                            ca1 -= 2;
                            ans1[i] = 'a';
                            ans1[n - i - 1] = 'a';
                        }else{
                            cb1 -= 2;
                            ans1[i] = 'b';
                            ans1[n - i -1] = 'b';
                        }
                        if(cb2 > 2){
                            cb2 -= 2;
                            ans2[i] = 'b';
                            ans2[n - i - 1] = 'b';
                        }else{
                            ca2 -= 2;
                            ans2[i] = 'a';
                            ans2[n - i -1] = 'a';
                        }
                    }
                    if(ca1 > 0) ans1[n / 2] = 'a';
                    if(cb1 > 0) ans1[n / 2] = 'b';
                    if(ca2 > 0) ans2[n / 2] = 'a';
                    if(cb2 > 0) ans2[n / 2] = 'b';
                    for(int i = 0;i < n;i++){
                        System.out.print(ans1[i]);
                    }
                    System.out.println();
                    for(int i = 0;i < n;i++){
                        System.out.print(ans2[i]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
