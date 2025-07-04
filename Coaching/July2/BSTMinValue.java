package Coaching.July2;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Solution {
    int ans =-1;
    int minValue(Node root) {
        // int ans = -1;
        if(root == null) return ans;
        int ans = root.data;
        if(root.left != null) {
            ans = root.left.data;
            return minValue(root.left);
            
        }
        return ans;

    }
}