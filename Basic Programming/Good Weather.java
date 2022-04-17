import java.util.*;

class GoodWeather {
    static void Weather(int[] a){
        int count = 0;
        for(int i = 0;i < a.length;i++){
            if(a[i] == 1){
                count++;
            }
        }
        if(count >= 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testcase = input.nextInt();
            for(int i = 0;i < testcase;i++){
                int a[] = new int[7];
                for(int j = 0;j < a.length;j++){
                    a[j] = input.nextInt();
                }
                Weather(a);
            }
        }
    }
}