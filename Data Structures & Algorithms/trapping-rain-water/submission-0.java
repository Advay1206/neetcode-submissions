class Solution {
    public int trap(int[] height) {
        int l = 0;
        int totalArea = 0;
        int currArea = 0;
        for (int r = 0; r < height.length; r++){
            if (height[r] >= height[l]){
                totalArea += currArea;
                currArea = 0;
                l = r;
            } else {
                currArea += height[l] - height[r];
            }
        }

        currArea = 0;
        int r = height.length - 1;
        for (int i = height.length - 1; i >= l; i--) {
            if (height[i] >= height[r]) {
                totalArea += currArea;
                currArea = 0;
                r = i;
            } else {
                currArea += height[r] - height[i];
            }
        }

        return totalArea;

    }
}
