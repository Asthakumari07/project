import java.util.*;
public class Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();

        if(number1 == number2) {
            System.out.println("those numbers are equal");
        }

        else if(number1 > number2) {
            System.out.println("number1 is greater than number2");

        }
        else
        {
            System.out.println("number2 is grteater than number1");
        }

        
    }
    
}
