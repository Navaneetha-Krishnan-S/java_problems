import java.util.Arrays;

public class FindMissingNuminArray {
    public static void main(String[] args) {
          System.out.println("Cyclic Sort");
        int[]arr={2,3,4,0,1,5,6,7,8,10};
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Sorted Array: ");
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Missing Number is "+ miss(arr));
    }

    public static void cyclic (int []  arr){
        for (int i = 0; i < arr.length; ) {
            int check = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[check]){
                int temp = arr[i];
                arr[i]=arr[check];
                arr[check]=temp;
            }
            else{
                i++;
            }
        }
        
    }

    public static int miss(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i) {
                return i;
            }

        }
        return arr.length;
    }
}
