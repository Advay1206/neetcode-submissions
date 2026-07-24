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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
    int dfs(TreeNode root, int good){
        if (root == null){
            return 0;
        }
        int res = root.val >= good ? 1 : 0;
        good = Math.max(good, root.val);
        res += dfs(root.right, good);
        res += dfs(root.left, good);
        return res;
    }
}