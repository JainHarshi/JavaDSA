package Coaching.July1;

import java.util.ArrayList;
import java.util.List;

// import javax.swing.tree.TreeNode;

public class PreorderRecursive {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root));
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        preorder( root, ans);
        return ans;


    }
    public static void preorder(TreeNode root, ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        preorder(root.left , ans);
        preorder(root.right, ans);

    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

