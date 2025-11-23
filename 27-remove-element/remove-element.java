class Solution {
    public int removeElement(int[] nums, int val) {
        int temp=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        return j;
    }
}