class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(nums[i] < pivot){
                less.add(nums[i]);
            }
            else if(pivot == nums[i]){
                equal.add(nums[i]);
            }
            else{
                greater.add(nums[i]);
            }
        }

        for(int i = 0;i<nums.length;i++){
            if(i<less.size()){
                nums[i] = less.get(i);
            }
            else if(i<less.size()+equal.size()){
                nums[i] = equal.get(i-less.size());
            }
            else{
                nums[i] = greater.get(i-(less.size()+equal.size()));
            }
        }
        return nums;
    }
}
