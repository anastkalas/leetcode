class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2){
            return nums;
        }
        int i = 0;
        Arrays.sort(nums);
        int[] result = new int[2];
        int pointer = 0;
        while(pointer<nums.length){
            if(pointer==0){
                if(nums[pointer+1]!=nums[pointer]){
                    result[i]=nums[pointer];
                    i++;
                }
            }
            else if(pointer>0 && pointer<nums.length-1){
                if(nums[pointer-1]!=nums[pointer] && nums[pointer]!=nums[pointer+1]){
                    result[i]=nums[pointer];
                    i++;
                }
            }
            else{
                if(nums[pointer]!=nums[pointer-1]){
                    result[i]=nums[pointer];
                    i++;
                }
            }
            pointer++;
        }
        return result;
    }
}
