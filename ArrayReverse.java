import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        intReverse();
        stringReverse();
    }
    public static void intReverse(){
        System.out.println("Enter a number to create an Array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i <n; i++) {
            arr[i]=in.nextInt();
            
        }
        System.out.println("Original Order: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversed Order: ");
        reverseint(arr);

    }

    public static void reverseint(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) { 
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void stringReverse(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to create an String Array: ");
        int n = in.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the names: ");

        for (int i = 0; i < n; i++) {
            str[i]=in.next();
        }
        System.out.println("Orignal Order");
        System.out.println(Arrays.toString(str));
        reverseStr(str);

    }

    public static void reverseStr(String[] str){
        int start=0;
        int end = str.length-1;
        while (start<end) { 
            String temp= str[start];
            str[start] =str[end];
            str[end]=temp;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(str));
    }

}
