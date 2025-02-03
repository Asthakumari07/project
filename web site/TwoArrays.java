import java.util.*;
public class TwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the no of column : ");
        int columns = sc.nextInt();

        //array declearation
        int[][] numbers = new int[rows][columns];

        //input for rows
        for(int i=0; i<rows; i++){
            //input for columns
            for(int j=0; j<columns; i++){
                //input for the value of matrics
        
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
