import java.util.*;

class Bi_lindrome {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int l = input.nextInt();
            int out = 0;
            String s = input.next();
            for (int i = 0; i < (l - 1); i++) {
                s.charAt(i);
                for (int j = i + 1; j < l; j++) {
                    if(s.charAt(j) == s.charAt(i)){
                        out = l - 2;
                        System.out.println(out);
                        i = l + 1;
                        j = l + 1;
                    }
                }
            }
            if(out == 0){
                System.out.println("-1");
            }
        }
    }
}