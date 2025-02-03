import java.util.*;

class Outer
 { 

    int age;

    public void show()
    {
        System.out.println(" in show");
    }

    class Inner
    {
        int age = 10;

    }
    
}

class Demo
{
    public static void main(String[] args) {
    
        
        Outer obj1 = new Outer();
        obj1.show();


        Outer.Inner obj2 = obj1.new Inner();

        System.out.println("Age is : " +obj2.age);
    }

}
