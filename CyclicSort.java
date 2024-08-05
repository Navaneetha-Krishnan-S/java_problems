import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
          System.out.println("Cyclic Sort");
        int[]arr={5,4,3,2,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic (int []  arr){
        for (int i = 0; i < arr.length; ) {
            int check = arr[i]-1;
            if(arr[i]!=arr[check]){
                int temp = arr[i];
                arr[i]=arr[check];
                arr[check]=temp;
            }
            else{
                i++;
            }
        }
        
    }
}
