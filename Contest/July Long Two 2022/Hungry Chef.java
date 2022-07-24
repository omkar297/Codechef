import java.util.Scanner;

class HungryChef {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int x = input.nextInt();
            int y = input.nextInt();
            int n = input.nextInt();
            int r = input.nextInt();
            if((r / y) >= n){
                System.out.println(0+" "+n);
            }else if((r / x) < n){
                System.out.println("-1");
            }else{
                int nofBug = (r - (y * n))/(x - y);
                if((r - (y * n)) % (x - y) != 0){
                    nofBug+=1;
                }
                System.out.println(nofBug+" "+(n - nofBug));
            }
        }
    }
}