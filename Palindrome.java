
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String to reverse.");
        Scanner in =  new Scanner(System.in);
        String name = in.next();
        String rev ="";
       String name1 = name.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = name1.length()-1; i >=0; i--) {
           rev = rev+name1.charAt(i);
        }
        System.out.println(rev);
        if(name1.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
   

}
