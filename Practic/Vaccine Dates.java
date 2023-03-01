import java.util.*;

class VaccineDates {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int d = input.nextInt();
            int l = input.nextInt();
            int r = input.nextInt();
            if(d >= l && d <= r){
                System.out.println("Take second dose now");
            }else if(d > r){
                System.out.println("Too Late");
            }else{
                System.out.println("Too Early");
            }
        }
    }
}