
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search ");
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a number to search in array");
        Scanner in =new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(binary(arr ,target));
    }

    public static int  binary(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) { 
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }

           

        }
        return -1 ;
    }
}
