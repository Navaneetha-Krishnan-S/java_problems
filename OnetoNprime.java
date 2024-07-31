import java.util.*;

public class OnetoNprime {
    public static void main(String[] args) {
        System.out.println("Enter number to find the all Prime Number: ");
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if(num ==1){
            System.out.println("1 is not a Prime Number ");
        }
        else{
            System.out.print("The Prime numbers are ");
            for (int i = 2; i < num; i++) {
                
                for (int j = 2; j < i; j++) {

                    if(i%j==0){
                        
                    }
                    else{
                        System.out.print(j+",");
                        break;
                    }
                    
                }
                
            }
        }

    }
}
