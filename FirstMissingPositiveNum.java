public class FirstMissingPositiveNum {
    public static void main(String[] args) {
    System.out.println("Finding First Missing Postive Number: ");
    int[] nums ={7,8,9,11,12};
    
    int ans =firstMissingPositive(nums);
        System.out.println(ans);
    }
    public static int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length;) {
            int check = nums[i]-1;
            if(nums[i]>0 &&nums[i]<=nums.length &&nums[i]!=nums[check]){

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
               return i+1; 
        }
        
     
    }
    return nums.length+1;
}
}
