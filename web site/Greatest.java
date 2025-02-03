
    import java.util.*;
    public class Greatest {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the first number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();   
        System.out.println(num);
        int num2;
        System.out.println("Enter the second number :");
        num2 = sc.nextInt();
        System.out.println(num2);
        int num3;
        System.out.println("Enter the third number :");
        num3 = sc.nextInt();
        System.out.println(num3);
        
        if ( num >= num2 && num >= num3)
        System.out.println(num + "is the greatest number.");
        
        else if (num2 >= num && num2 >= num3)
        System.out.println(num + "is the greatest number. ");
        
        else 
        System.out.println(num3 + " is the greatest number. ");
        
    }
}
    

