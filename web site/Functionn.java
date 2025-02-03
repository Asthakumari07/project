import java.util.*;
public class Functionn {
    public static int greaterNumber(int a, int b){
        if(a > b) {
            return a;
        }else {
            return b;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        System.out.println("the greatest number is -- "+greaterNumber(a, b));

    }
    
}
