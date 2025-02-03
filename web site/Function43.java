import java.util.*;
public class Function43 {
    public static boolean isElligible(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        System.out.println(isElligible(age));

    }
    
}
