public class minheightOftree {
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

 // this is the Function for finding the minimum height of a tree
class Solution {
    public int minDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        if(root.left ==null){
            return 1 +minDepth(root.right);
        }
        if(root.right ==null){
            return 1 +minDepth(root.left);
    }
    return 1+Math.min(minDepth(root.right),minDepth(root.left));
}
}
}
