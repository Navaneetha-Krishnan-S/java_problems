
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num;
        
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
          int originalNum = num;
        int sum =0;
      
        while(num>0){
            int arm = num%10;
            
           
           sum = sum+arm*arm*arm;
           num=num/10;
            


        }
        if(originalNum == sum){
            System.out.println(originalNum+" is a Armstrong Number.");
        }
        else{
            System.out.println(originalNum+ " is not a Armstrong Number.");
        }
    }
}
