
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String to reverse.");
        Scanner in =  new Scanner(System.in);
        String name = in.next();
        String rev ="";
       
        for (int i = name.length()-1; i >=0; i--) {
           rev = rev+name.charAt(i);
        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
   

}
