class Solution {
    public int[] moveZeroes(int[] nums) {
        int temp=0;
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;  
                j++;          
            }
        }
        return nums;
    }
}