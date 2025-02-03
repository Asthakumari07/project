import java.util.*;
public class Function3 {
    public static void primeNumber(int n){
        if(n % 1 == 0 || n ! = 1){
            System.out.println("this is a prime number.");
        }else{
            System.out.println("Involid number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        primeNumber(n);


    }
    
}
