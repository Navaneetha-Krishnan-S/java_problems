
import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        System.out.println("Finding the Duplicate and Missing Number");
        int []  nums = {1,1};
        int [] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums) {

        for (int i = 0; i < nums.length;) {
            int check = nums[i]-1;
            if (nums[i]!=nums[check]) {
                int temp = nums[i];
                nums[i]=nums[check];
                nums[check]=temp;
            }
            else{
                i++;
            }
        }
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i]!=i+1) {
                return new int[]{nums[i],i+1};
            }
        }
        
        return new int[] {-1,-1};
    }
}
