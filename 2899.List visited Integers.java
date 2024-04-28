class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        //if k<=seen.length then append the k-th element of seen to ans
        //if>length.seen then append -1 to ans
        List<Integer> ans= new ArrayList<>();
        List<Integer> seen=new ArrayList<>();
        int k=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                k=0;
                seen.add(0, nums[i]);
            }
            else{
                k=k+1;
                if(k<=seen.size()){
                    ans.add(seen.get(k-1));
                }
                else{
                    ans.add(nums[i]);
                }
            }
        }
        return ans;
    }
}
