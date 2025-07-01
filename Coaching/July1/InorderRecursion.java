package Coaching.July1;

import java.util.ArrayList;
import java.util.List;

public class InorderRecursion {

    public static void main(String[] args) {
        // Sample Tree: [1, null, 2, 3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Call inorderTraversal and print result
        List<Integer> result = inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result); // Output: [1, 3, 2]
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private static void inorder(TreeNode node, List<Integer> ans) {
        if (node == null) return;
        inorder(node.left, ans);     // Visit left
        ans.add(node.val);           // Visit root
        inorder(node.right, ans);    // Visit right
    }
}

// Binary Tree Node class
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { this.val = val; }
}
