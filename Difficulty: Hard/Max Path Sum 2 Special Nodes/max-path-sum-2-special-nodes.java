/* class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    int maxSum = Integer.MIN_VALUE;

    int maxPathSum(Node root) {
        int val = solve(root);
        
        // 🔥 FIX: handle skewed tree case
        return (maxSum == Integer.MIN_VALUE) ? val : maxSum;
    }

    int solve(Node root) {
        if (root == null) return 0;

        // If leaf node (special node)
        if (root.left == null && root.right == null) {
            return root.data;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        // If both children exist → valid path between two special nodes
        if (root.left != null && root.right != null) {
            maxSum = Math.max(maxSum, left + right + root.data);
            return root.data + Math.max(left, right);
        }

        // If only one child exists
        return (root.left == null) ? root.data + right : root.data + left;
    }
}