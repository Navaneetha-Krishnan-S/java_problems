
import java.util.Arrays;
import java.util.Scanner;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        System.out.println("Agnostic Binary Search:");
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a new to search and get the index number");
        int num =in.nextInt();

        System.out.println(search(arr,num));

    }

    public static int search(int[] arr, int num){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        
        while (start<=end) { 
            int mid = (start+end)/2;
            if(arr[mid]==num){
                return mid;
            }
            if(isAsc){
            if(num<arr[mid]){
                end=mid-1;
            }
            else {
                start = mid+1;
            }
        }
        else{
            if(num>arr[mid]){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
           
        }
        return -1;
    }
 
        
    
}
