import java.util.*;
class Pattern{
    public static void main(String args[]){
        int n = 4;
        for(int i=0; i<n; i++){ 
            for(int j=n-i-1; j>=1; j--)
                System.out.print(" ");
                for(int j=0; j<=i;j++)
                System.out.print("* ");
            
            System.out.println();
        }
    }
}