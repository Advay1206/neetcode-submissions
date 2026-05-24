class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n; i++){
            int currentTarget = target - numbers[i];
            boolean flag = false;
            int l = i + 1;
            int r = n - 1;
            int mid = 0;
            while (l <= r){
                mid = (l + r) / 2;
                if (numbers[mid] == currentTarget){
                    flag = true;
                    break;
                }
                if (numbers[mid] > currentTarget){
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if(flag){
                return new int[] {i + 1, mid + 1};
            }
        }
        return new int[]{};
    }
}
