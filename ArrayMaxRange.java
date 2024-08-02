
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxRange {
    public static void main(String[] args) {
        System.out.println("Enter a number to creat an Array");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array values ");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the Range to find the Maxmimum Value: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        maxRange(arr,num1,num2);
        
    }

    public static void maxRange(int[] arr,int range1,int range2){
        int max=arr[range1];
        for (int i = range1; i <range2; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            
        }
        System.out.println("The maximum number between the range is "+max);
    }
}
