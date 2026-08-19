class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        backtrack(nums, perm, perms);
        return perms;
    }
    void backtrack(int[] nums, List<Integer> perm, List<List<Integer>> perms){
        // Base Case: perm.size() == nums.length
        if (nums.length == perm.size()){
            perms.add(new ArrayList<>(perm));
            return;
        }
        // Choosing step: Decide which number to check, since there are n number, we loop
        for (int i = 0; i < nums.length; i++){
            // Check if current num is already in perm
            // Since nums are all distinct, we can do this
            if (perm.contains(nums[i])){
                continue;
            }
            // Note: checking a list for an element is an o(n) method, optimize it with either a hashSet or a boolean array
            perm.add(nums[i]);
            backtrack(nums, perm, perms);
            perm.remove(perm.size() - 1);
        }
        
    }   
}