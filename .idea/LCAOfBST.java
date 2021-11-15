/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class LCAOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while(true)
        {
            if(root.val>p.val && root.val>q.val)
                root = root.left;
            else if(root.val<p.val && root.val<q.val)
                root = root.right;
            else
                // else if((root.val>=p.val && root.val<=q.val) || (root.val<=p.val && root.val>=q.val))
                return root;
        }

        // if(root.val>p.val && root.val>q.val)
        //     return lowestCommonAncestor(root.left,p,q);
        // else if(root.val<p.val && root.val<q.val)
        //     return lowestCommonAncestor(root.right,p,q);
        // else
        // // else if((root.val>=p.val && root.val<=q.val) || (root.val<=p.val && root.val>=q.val))
        //     return root;
    }
}



//Time complexity is O(logn)
//Space complexity is O(logn)