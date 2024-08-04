import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchin2DArray {
      public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to search and return it's position.");
        int target = in.nextInt();
        int[] ans = linearSearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] linearSearch(int[][] arr,int target){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
