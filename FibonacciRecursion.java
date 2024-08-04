import java.util.*;
public class FibonacciRecursion {
    public static void main(String[] args) {
       System.out.println("Enter a number to find Fibonacci: ");
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        
        System.out.println(fibo(num));
        in.close();

      
}

static int fibo(int num){

    if(num<2)
        return num;
       

    return fibo(num-1) + fibo(num-2 );


}
}
