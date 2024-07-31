import java.util.*;

public class CountDigitinNumber {
    public static void main(String[] args) {
        long value;
        int findNum;
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        value = in.nextLong();
        System.out.println("Enter the digit to Count: ");
        findNum=in.nextInt();
        int count=0;
        while(value>0){
            long cal = value%10;
            if(cal==findNum){
                count++;
                
            }
           
                value=value/10;
            
        }
        System.out.println(findNum+" has occured " +count+ " times.");


    }
}
