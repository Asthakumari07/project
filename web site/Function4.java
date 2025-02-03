import java.util.*;
public class Function4 {
    public static void printTable(int n){

        for(int i=1; i<=10; i++){
            
               
            System.out.println(n+"*"+i+"="+n*i);
            
           
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();

        

        printTable(num);


    }
    
}
