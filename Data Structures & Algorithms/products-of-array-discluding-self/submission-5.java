class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int nzProduct = 1; // Product of all elements except zero
        int countZeros = 0;
        for (int num : nums){
            if (num == 0){
                countZeros++;
            } else {
                nzProduct *= num;
            }
        }
        if (countZeros >= 2) return res;
        for (int i = 0; i < n; i++){
            if (countZeros > 0){
                if (nums[i] != 0){
                    res[i] = 0;
                } else {
                    res[i] = nzProduct;
                }
            } else {
                res[i] = nzProduct / nums[i];
            }
        }
        return res;
    }
}  
