class Solution {
    public boolean binarySearch(int []arr, int target){
        int l = 0;
        int r = arr.length - 1;
        while (l < r){
            int mid = (l + r)/2;
            if (target == arr[mid]) return true;
            if(target < arr[mid]){
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++){
            if(target == matrix[i][cols - 1]) return true;
            if(target > matrix[i][cols - 1]) continue;
            else {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }
}
