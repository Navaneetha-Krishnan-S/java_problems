import java.util.*;

public class FibonacciLoop {
    public static void main(String[] args) {
        System.out.println("Enter number to find the Fibonacci number: ");
        int n, a, b, temp;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a =0;
        b=1;
        temp =0;
        
        for (int i = 2; i <= n; i++) {
            temp =a+b;
            a =b;
            b=temp;
            
        }
        System.out.println(temp);
    }
}
