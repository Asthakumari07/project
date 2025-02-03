import java.util.*;
public class Overloading {
    public int FunctionName(int x, int y){
        return ( x + y );
    }

    public int FunctionName(int x, int y, int z){
        return( x + y + z );

    }

    public double FunctionName(double x , double y){
        return( x + y );
    }

    public static void main(String[] args) {
        
        Overloading obj1 = new Overloading();  


        System.out.println(obj1.FunctionName(10,20));
        System.out.println(obj1.FunctionName(10, 20, 30));
        System.out.println(obj1.FunctionName(10.5, 20.5));
    }

    
}
