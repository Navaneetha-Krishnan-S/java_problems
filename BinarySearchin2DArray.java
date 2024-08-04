
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchin2DArray{
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to search and return it's position.");
        int target = in.nextInt();
        int[] ans = binarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] binarySearch(int[][] arr, int target){
        int row = 0;
        int col = arr[row].length-1; 
        while (row<arr.length && col>=0) { 
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            else if(target>arr[row][col]){
                row++;
            }
            else{
                col--;
            }
            
        }

        return new int[]{-1,-1};
    }
}