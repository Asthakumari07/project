import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        float p, r, t, interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        p = sc.nextFloat();
        System.out.println("Enter the rate of interest");
        r = sc.nextFloat();
        System.out.println("Enter the time period");
        t = sc.nextFloat();
        interest = (p * r * t) / 100;
        System.out.println("Simple interest is : " +interest);
        

    }
    
}