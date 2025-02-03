import java.util.*;
public class Botton{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch(number){

            case 1 : System.out.println("hiii");
            break;

            case 2 : System.out.println("hello");
            break;

            case 3 : System.out.println("namaste");
            break;
             
            default : System.out.println("Invalid Button");
        }
    }

}