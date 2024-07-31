import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        long value;
        System.out.println("Enter a number to reverse: ");
        Scanner in = new Scanner(System.in);
        value = in.nextLong();
        System.out.println("Reverse order: ");
        while(value>0){
            long cal = value%10;
            long reverse = cal;
            System.out.print(reverse);
                value=value/10;
            
        }
        


    }
}
