import java.util.*;

/**
 * Interface
 */
interface client 
{

    void input();
    void output();
}

class Developer implements client
{
 
    String name; double sal;
    public void input()

    {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        name = sc.nextLine();

        System.out.println("Enter Salay: ");
        sal = sc.nextDouble();

    }
    public void output()
    {
        System.out.println(name);
        System.out.println(sal);
    }
    public static void main(String[] args) {
        client c=new Developer();
        c.input(); c.output();
    }

}