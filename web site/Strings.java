import java.util.*;
public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        //string declaration
        String name = sc.next();
        System.out.println("Enter your full name : ");
        String fullName = sc.nextLine();
        System.out.println("Enter the information about you : ");
        String sentance = sc.nextLine();
        System.out.println("Your name is : "+name);
        System.out.println("your full name is : "+fullName);
        System.out.println("Write the information about you : "+sentance);
    
    }
    
}
