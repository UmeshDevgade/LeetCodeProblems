// 1 ms | 45.6 MB
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
    int answer = 0;

    // Stores information about a subtree
    class Result {
        int sum;
        int count;

        Result(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    // Postorder traversal
    Result solve(TreeNode root) {

        // Base case
        if (root == null) {
            return new Result(0, 0);
        }

        // Traverse left subtree
        Result left = solve(root.left);

        // Traverse right subtree
        Result right = solve(root.right);

        // Calculate current subtree
        int sum = root.val + left.sum + right.sum;
        int count = 1 + left.count + right.count;

        // Check average
        if (root.val == sum / count) {
            answer++;
        }

        // Return information to parent
        return new Result(sum, count);
    }

    public int averageOfSubtree(TreeNode root) {

        solve(root);

        return answer;
    }

}