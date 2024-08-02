
import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayNum{
    public static void main(String[] args) {
        System.out.println("Enter a number to create an Array");


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        System.out.println("Enter number of "+n);
        int[]  arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter  2 index to swap number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        swap(arr , num1,num2);
        System.out.println(Arrays.toString(arr));
        nameSwap();
    }
    public static void swap(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }


    public static void nameSwap(){

        System.out.println("Enter a number to create a String Array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        System.out.println("Enter names");

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] =in.next();
            
        }
        System.out.println(Arrays.toString(str));
        System.out.println("Enter the index number to Swap:");
        int str1 = in.nextInt();
        int str2 = in.nextInt();

        nameSwap(str,str1,str2 );
        System.out.println(Arrays.toString(str));
        
    }
    public static void nameSwap(String[] str, int name1,int name2){
        String temp = str[name1];
        str[name1]=str[name2];
        str[name2]=temp;


    }
}
