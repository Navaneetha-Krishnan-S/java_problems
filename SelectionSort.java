
import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        System.out.println("Selection sort");
        int[]arr={4,5,1,3,2};
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
         int last = arr.length-1-i;
         int max=0;
         for (int j = 0; j <=last; j++) {
              
            if(arr[max]<arr[j]){
                max=j;
            }
         }
         
         int temp = arr[max];
         arr[max]=arr[last];
         arr[last]=temp;

           
        }
    }
}