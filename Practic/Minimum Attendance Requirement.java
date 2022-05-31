import java.util.*;

class MinimumAttendanceRequirement {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int testcase = input.nextInt();
        while(testcase-- > 0){
            int n = input.nextInt();
            String b = input.next();
            int count = 0;
            for(int i = 0;i < b.length();i++){
                if(b.charAt(i) == '1'){
                    count++;
                }
            }
            if((120 - n) + count >= 90){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }    
    }
}