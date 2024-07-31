  // FIND THE MIN AND MAX OF GIVEN THREE NUMBER

import java.util.*;
public class MaxMin3num {
    

  

public static void main(String[] args) {

    int a,b,c;
    System.out.println("Enter three number to find the Maximum and Minimum number: ");
    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    int max =a;
    int min =a ;

    if(b>max)
    max=b;
    if(c>max)
    max=c;
    System.out.println("The maximum number is "+max);

  min = Math.min(c,Math.min(a,b));
    System.out.println("The minimum number is "+min);
    
}

}
