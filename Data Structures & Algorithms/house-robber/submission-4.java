class Solution {
    public int rob(int[] nums) {
        int next = 0;      // best loot starting two houses ahead
        int nextNext = 0;  // best loot starting three houses ahead

        for (int i = nums.length - 1; i >= 0; i--) {
            int current = Math.max(next, nums[i] + nextNext);
            nextNext = next;
            next = current;
        }

        return next;
    }
}