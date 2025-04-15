class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();

        backtrack(candidates, target, res, 0, new ArrayList<>(), 0);

        return res;
    }
    public void backtrack(int[] candidates, int target, List<List<Integer>> res, int index, List<Integer> comb, int total){

        if(total == target){
            res.add(new ArrayList<>(comb));
            return;
        }

        if(total > target || index >= candidates.length){
            return;
        }

        comb.add(candidates[index]);
        backtrack(candidates, target, res, index, comb, total + candidates[index]);
        comb.remove(comb.size()-1);
        backtrack(candidates, target, res, index + 1, comb, total);
    }
}
