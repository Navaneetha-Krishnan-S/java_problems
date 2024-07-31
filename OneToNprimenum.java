import java.util.*;

public class OneToNprimenum {
 public static void main(String[] args) {

    int num;
    System.out.println("Enter a number to find all Prime Number: ");

    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    if(num<=1){
        System.out.println(num + " is not a Prime number");

    }
   
    for (int i = 2; i <=num; i++) {
        
            boolean isTrue = true;
        for (int j = 2; j < i; j++) {

            if(i%j==0){
            isTrue = false;
            break;
            }
            
        }
        if(isTrue == true){
        System.out.print(i +", ");
    }
        
    }
 }   
}
