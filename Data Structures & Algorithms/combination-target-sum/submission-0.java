class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(candidates, target, 0, list, combinations, 0);
        return combinations;
    }
    void backtrack(int[] nums, int target, int curr, List<Integer> list, List<List<Integer>> combinations, int sum){
        if (sum == target){
            combinations.add(new ArrayList<>(list));
            return;
        }
        if (sum > target || curr >= nums.length){
            return;
        }
        // Option 1: include nums[curr] again (stay at curr, allowing reuse)
        list.add(nums[curr]);
        backtrack(nums, target, curr, list, combinations, sum + nums[curr]);
        list.remove(list.size() - 1);

        // Option 2: skip nums[curr] entirely, move on to curr+1 — no forced add
        backtrack(nums, target, curr + 1, list, combinations, sum);
    }
}