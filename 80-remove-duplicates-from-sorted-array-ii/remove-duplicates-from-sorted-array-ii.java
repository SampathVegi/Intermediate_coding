class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2,j=2;
        if(nums.length<=2) return nums.length;
        for(;j<nums.length;j++){
            if(nums[j]>nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}