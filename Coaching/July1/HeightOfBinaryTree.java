package Coaching.July1;

public class HeightOfBinaryTree {

    public static void main(String[] args) {
        // Example Tree:
        //       1
        //      / \
        //     2   3
        //    /
        //   4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int height = maxDepth(root);
        System.out.println("Height / Max Depth of Binary Tree: " + height); // Output: 3
    }

    // Method to calculate height (max depth)
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int lft = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(lft, right);
    }
}

// TreeNode class
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
