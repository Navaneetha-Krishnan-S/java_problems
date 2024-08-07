

public class FindMissingNumArray{
    public static void main(String[] args) {
        System.out.println("Finding Missing Number in an Array");
        int[] arr={9,6,4,2,3,5,7,0,1};
        System.out.println("The Missing Number is ");
        System.out.println(arrange(arr));
        
   
      
    }

    public static int arrange(int[] arr){

        for (int i = 0; i <arr.length; ) {
            int check = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[check]) {
                int temp = arr[i];
                arr[i]=arr[check];
                arr[check]=temp;
            }
            else{
                i++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i) {
                return i;
            }
        }
        return arr.length;
    }

       
    

}