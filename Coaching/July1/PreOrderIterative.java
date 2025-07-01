package Coaching.July1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {

    public static void main(String[] args) {
        // Construct the tree: [1, null, 2, 3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = preorderTraversal(root);
        System.out.println("Preorder Traversal (Iterative): " + result); // Output: [1, 2, 3]
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            ans.add(node.val);

            // Push right first so left is processed first
            if (node.right != null) st.push(node.right);
            if (node.left != null) st.push(node.left);
        }

        return ans;
    }
}

// TreeNode class definition
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

