public class Solution{
    static public void moveZeroes(int[] nums) {
    int i = 0; // index to place next non-zero

    // Move non-zeros to the front
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != 0) {
            nums[i++] = nums[j];
        }
    }

    // Fill remaining positions with zeros
    while (i < nums.length) {
        nums[i++] = 0;
    }
}
}
