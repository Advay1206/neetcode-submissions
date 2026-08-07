class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subs = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(nums, 0, nums.length, subset, subs);
        return subs;
    }
    void backtrack(int [] nums, int i, int len, List<Integer> subset, List<List<Integer>> subs){
        if (i >= len){
            subs.add(new ArrayList<>(subset));
            return;
        }
        // Choice 1: dont add nums[i]
        backtrack(nums, i + 1, len, subset, subs);
        // Choice 2: add nums[i]
        subset.add(nums[i]);
        backtrack(nums, i + 1, len, subset, subs);
        subset.remove(subset.size() - 1);
        return;
    }
}
