class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 1){
            return nums;
        }

        int count = 0;
        int product = 1;
        boolean check = true;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                product = product * nums[i];
            }
            else{
                count = count + 1;//there is a 0
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0 && count > 0){
                nums[i] = 0;
            }
               
            else if(0 == count - 1 && nums[i] == 0){
                nums[i] = product;
            }
            else if(nums[i] == 0 && count - 1 > 0){
                nums[i] = 0;
            }
            else{
                if(nums[i]!=0){
                    nums[i] = (int) (product * Math.pow(nums[i], -1));
                }
                else{
                    nums[i] = product;
                }
            }

        }

        return nums;

    }
}
