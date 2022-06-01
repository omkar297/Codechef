import java.util.*;

class ProgramCalculator {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double a = input.nextInt();
        double b = input.nextInt();
        char o = input.next().charAt(0);
        switch(o){
            case '+':{
                System.out.println(a + b);
                break;
            }
            case '-':{
                System.out.println(a - b);
                break;
            }
            case '*':{
                System.out.println(a * b);
                break;
            }
            case '/':{
                System.out.println(a / b);
                break;
            }
        }
    }
}