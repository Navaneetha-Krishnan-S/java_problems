



public class FindDuplicateNumArray {
    public static void main(String[] args) {
        System.out.println("Finding Duplicate number in an Array");
        int [] nums = {3,1,5,5,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        for (int i = 0; i < nums.length;) {
            int check = nums[i]-1;

            if(nums[i]<nums.length && nums[i]!=nums[check]){
                int temp = nums[i];
                nums[i]=nums[check];
                nums[check]=temp;
            }
            else{
                i++;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return -1;


     

        
    }
}
