
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        System.out.println("Enter number to create an Array: ");
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        System.out.println("Enter "+n+" number to create an Array");
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
           arr[i]=in.nextInt();

            
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
           
            if (max < arr[i]) {
                max = arr[i];
            }
            
        }
        System.out.println("The maximum number : ");
        System.out.print(max);
       
       
    }


    
}
