class Solution {
    static{
        for(int i=0; i<=500; i++)
            moveZeroes(new int[]{});
    }
    static public void moveZeroes(int[] nums) {
    int i=0;
    int j=0;
    int count=0;
    while(j<nums.length){
        if(nums[j]==0){
            count++;
            j++;
        }
        else{
            // nums[i]=nums[j];
            // i++;
            // j++;
            nums[i++]=nums[j++];
        }
    }
    for(int k=nums.length-count;k<nums.length;k++){
        nums[k]=0;
    }
} 

        
    }