import java.util.*;

class TwoTrains {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int nStation = 0,sum = 0,diff = 0,i = 0;
            nStation = input.nextInt();
            int a[] = new int[nStation],b[] = new int[nStation];
            for(i = 1;i < nStation;i++){
                a[i] = input.nextInt();
                sum += a[i];
                b[i] = a[i];
                a[i] = sum;
            }
            for(i = 0;i < nStation - 1;i++){
                diff = a[i + 1] - b[i];
                if(diff > 0){
                    b[i + 1] = b[i] + diff + b[i + 1];
                }else{
                    b[i + 1] = b[i] + b[i + 1];
                }
            }
            System.out.println(b[i]);
        }
    }
}
