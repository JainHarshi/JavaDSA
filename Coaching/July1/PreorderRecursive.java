public class PreorderRecursive {
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
