// class Solution {
//     public int[] moveZeroes(int[] nums) {
//         int temp=0;
//         for(int i=0,j=1;i<nums.length-1;j++){
//             if(nums[j]!=0&&nums[i]==0){
//                 temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 i++;
//             }
//         }
//         return nums;
//     }
// }


class Solution {
    public int[] moveZeroes(int[] nums) {
        int temp=0;
        for(int i=0,j=0;i<nums.length-1;j++){
            if(nums[i]==0 && nums[j]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            if(nums[i]!=0){
                i++;
            }
            if(j== nums.length-1){
                return nums;
            }
        }
        return nums;
    }
}