//Conversion of Celsius and Farhenheit
import java.util.*;

public class Celsius {
    


    static void temp(){
        Scanner input = new Scanner(System.in);
        float a;
        char n; 
        System.out.println("Enter the temperature: ");
        System.out.println("Press 'f' to convert from Celsius");
        System.out.println("Press 'c' to convert from Fahrenheit");
        n = input.next().charAt(0);
        if (n=='c'){
            System.out.println("Enter the Fahrenheit: ");
            Scanner in = new Scanner(System.in);
            a = in.nextFloat();
            float Cel = (a -32)*5/9;
            System.out.println("The Celsius of " + a + " Farhenheit" + " is "+ Cel+" C");
        } 
        else if(n=='f'){
            System.out.println("Enter the Celsius: ");
            Scanner in = new Scanner(System.in);
            a = in.nextFloat();
            float Fah = (a *9/5)+32;
            System.out.println("The Celsius of " + a + " Celsius" + " is "+ Fah+" F");
        }
        else{
            System.out.println("Enter the Correct the Value");
        }
    }
    public static void main(String[] args) {
        temp();
        
    }





}
