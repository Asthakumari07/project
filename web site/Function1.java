import java.util.*;
public class Function1 {
    public static void printFactorial(int n){

        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        printFactorial(n);

    }
}

   
    
    

