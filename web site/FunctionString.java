import java.util.*;
public class FunctionString {
    public static void main(String[] args){

        //concatenation
        String firstName = "astha";
        String secondName = "Sharma";
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);

        //lenght
        System.out.println(fullName.length());

        //charAt
        for(int i = 0; i< fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        //check condition 
        //1 s1 > s2 greater than :  +ve value
        //2 s1 < s2 less than : -ve value
        //3 s1 == s2  : 0

        if(firstName.compareTo(secondName) == 0){
            //if(firstname == secondname){

            System.out.println("Strings are equal");

        } else{
            System.out.println("Strings are not equal");
        }

        //substring
        String name = secondName.substring(0, 4);
        System.out.println(name);
        //strings are immutable


    }
    
}
