



import java.util.Scanner;

public class CalcUsingInfiniteWhileloop {
    
    public static void main(String[] args) {
        float a,b;
        float answer = 0f;
        while (true) { 
            System.out.println("Enter two Numbers: ");
        Scanner in = new Scanner(System.in);
        a=in.nextFloat();
        b=in.nextFloat();
        System.out.println("Enter the operator: + - * / % ");
        char op = in.next().trim().charAt(0);

        if(op == '+'){
            answer = a+b;
        }
        else if(op == '-'){
            answer = a-b;
        }
        else if(op == '*'){
            answer = a*b;
        }
        else if(op == '/'){
            if(b!=0){
                answer = a/b;
            }
            else{
                System.out.println("Cannot divided by zero");
                System.out.println();
            System.out.println("********************************");
            System.out.println();
                continue;
            }
        }
        else if(op == '%'){
            answer = a%b;
        }
        else if (op == 'x'||op=='X'){
            System.out.println("Thank You Happy Calculating!");
            System.out.println("********************************");
            break;

        }
        else{
            System.out.println("Enter Correct Operator");
            System.out.println();
            System.out.println("********************************");
            System.out.println();
            continue;
        }
            System.out.println(answer);
        }

        

    }
}
