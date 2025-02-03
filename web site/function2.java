import java.util.*;
public class function2 {
    public static void evenNumber(int n){
        if(n % 2 == 0){
            System.out.println("this is an even number. ");

        }else{
            System.out.println("this is an Odd number.");
        }
        return;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        evenNumber(n);



    }
    
}
