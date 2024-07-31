//FIND THE N PRIME NUMBER

import java.util.*;
public class N_prime_number{
public static void main(String[] args) {

    int n ;
    System.out.println("Enter a number to find the Prime number: ");
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    in.nextLine();
    if(n==2){
        System.out.println(n+" is a Prime Number");
        
    }
    for (int i = 2; i <n; i++) {
        
        if(n%i==0){
            System.out.println(n+ " is not a Prime Number.");
            break;


        }
       
        
        System.out.println(n+" is a Prime number.");
        break;
    }
    in.close();
}
}