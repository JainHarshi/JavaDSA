package Coaching.July1;

import java.util.ArrayList;
import java.util.List;

public class PostOrderRecursion {

    public static void main(String[] args) {
        // Construct tree: [1, null, 2, 3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = postorderTraversal(root);
        System.out.println("Postorder Traversal: " + result); // Output: [3, 2, 1]
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        post(root, ans);
        return ans;
    }

    public static void post(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) return;
        post(root.left, ans);        // Visit left subtree
        post(root.right, ans);       // Visit right subtree
        ans.add(root.val);           // Visit root
    }
}

// TreeNode class
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
