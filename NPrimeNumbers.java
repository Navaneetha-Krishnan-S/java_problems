import java.util.*;
class NPrimeNumbers{
    public static void main(String[] args) {
        int input;
        System.out.println("Enter a number to find prime number: ");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        if(input <=1){
            System.out.println("Enter valid number above 2 ");
        }
        int number = 2;
        for (int i = 0; i < input; number++) {

            Boolean isTrue = true;

            for (int j = 2; j < number; j++) {
                if(number%j==0){
                    isTrue = false;
                    break;
                }

            }
            if(isTrue==true){
                System.out.print(number+", ");
                i++;
            }
            
        }

    }
}