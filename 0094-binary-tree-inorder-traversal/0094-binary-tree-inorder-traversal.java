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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        helper(root, result);

        return result;
    }

    public void helper(TreeNode root, List<Integer> result) {

        // Base condition
        if (root == null) {
            return;
        }

        // 1. Visit left subtree
        helper(root.left, result);

        // 2. Add current node
        result.add(root.val);

        // 3. Visit right subtree
        helper(root.right, result);
    }
}