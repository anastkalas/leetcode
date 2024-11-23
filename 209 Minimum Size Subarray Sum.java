class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minlength = n+1;
        int left = 0;
        int sum = 0;

        for(int right=0;right<n;right++){
            sum = sum + nums[right];

            while(sum >= target){
                if(right-left+1 < minlength){
                    minlength = right-left+1;
                }
                sum = sum - nums[left];
                left = left + 1;
            }
        }

        if(minlength == n+1){
            return 0;
        }
        else{
            return minlength;
        }
    }
}
