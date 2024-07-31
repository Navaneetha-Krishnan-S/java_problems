
import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        int num;
        
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.println("Armstrong numbers from 100 to " + num + " are:");
        for (int i = 100; i < num; i++) {
            
        
          
        int sum =0;
        int originalNum = i;
        while(originalNum>0){
            int arm = originalNum%10;
            
           
           sum = sum+arm*arm*arm;
           originalNum=originalNum/10;
            
           
        }
        if(sum == i){
            System.out.println(i+" ");

        }
       
        }
    }
}
