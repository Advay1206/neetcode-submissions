/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        int l = dfs(root, 0);
        return flag;
    }
    int dfs(TreeNode root, int level){
        if (root == null){
            return 0;
        }
        int left = dfs(root.left, level + 1);
        int right = dfs(root.right, level + 1);
        if (Math.abs(left - right) > 1){
            flag = false;
        }
        return 1 + Math.max(left, right);
    }
}