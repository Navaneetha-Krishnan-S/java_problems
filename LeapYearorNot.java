
import java.util.Scanner;

public class LeapYearorNot {
    public static void main(String[] args) {
        System.out.println("Enter a year to check Leap year or not: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        System.out.println(check(year));

        
       

    }
    public static boolean check(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    
    }
}
