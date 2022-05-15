import java.util.*;

class ChefDolls {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int count = 0;
            int n = input.nextInt();
            int doll[] = new int[n];
            for(int i = 0;i < n;i++){
                doll[i] = input.nextInt();
            }
            for(int i = 0;i < n;i++){
                count = 0;
                for(int j = 0;j < n;j++){
                    if(doll[i] == doll[j]){
                        count++;
                    }
                }
                if(count % 2 != 0){
                    System.out.println(doll[i]);
                    break;
                }
            }
        }
    }
}