
import java.util.Scanner;

public class PrimeorNot{
    public static void main(String[] args) {
        System.out.println("Enter a number to find Prime or Not: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=1){
            System.out.println("Enter number above 2.");

        }
        if(n==2){
            System.out.println("2 is a Prime number");
        }
    
        boolean isTrue = true;
        for (int i = 2; i < n; i++) {

            if(n%i==0){
                isTrue=false;
                break;
            }
          
          
        }
        if(isTrue==true){
            System.out.println(n+ " is a Prime Number");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }
}