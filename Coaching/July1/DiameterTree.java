package Coaching.July1;

public class DiameterTree {
    public static void main(String[] args) {
        // Sample tree:
        //         1
        //        / \
        //       2   3
        //      / \     
        //     4   5  
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();
        int diameter = sol.diameterOfBinaryTree(root);
        System.out.println("Diameter of the Binary Tree: " + diameter);  // Output should be 3
    }
}
