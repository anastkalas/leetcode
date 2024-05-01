class Solution {
    public void moveZeroes(int[] nums) {
        /*int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    // Swap nums[j] and nums[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }*/
        int n = nums.length;
        // Reordering non-zero elements to the beginning
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }
        
        // Filling remaining elements with zeroes
        while (nonZeroIndex < n) {
            nums[nonZeroIndex++] = 0;
        }
    }
}
