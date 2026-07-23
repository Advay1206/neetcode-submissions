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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return search(root, p, q);
    }
    TreeNode search(TreeNode root, TreeNode p, TreeNode q){
        if (root == null || p == null || q == null){
            return null;
        }
        if(p.val > root.val && q.val > root.val){
            return search(root.right, p, q);
        }
        if (p.val < root.val && q.val < root.val){
            return search(root.left, p, q);
        }
        return root;
    }
}
