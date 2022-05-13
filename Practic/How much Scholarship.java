import java.util.*;

class HowmuchScholarship {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int Rank = input.nextInt();
        if(Rank <= 50){
            System.out.println(100);
        }else if(Rank >= 51 && Rank <= 100){
            System.out.println(50);
        }else{
            System.out.println(0);
        }
    }
}