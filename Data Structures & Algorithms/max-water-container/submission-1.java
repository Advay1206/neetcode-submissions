class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int n = heights.length;

        int maxArea = 0;
        while (l < r){
            int minHeight = Math.min(heights[l], heights[r]);
            int area = Math.abs((l - r)) * minHeight;
            maxArea = Math.max(maxArea, area);
            if (heights[l] < heights[r]) l++;
            else r--;
        }
        return maxArea;
    }
}
