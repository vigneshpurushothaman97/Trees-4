/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LCAOfBT {
    List<TreeNode> path1;
    List<TreeNode> path2;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        path1 = new ArrayList<>();
        path2 = new ArrayList<>();
        backtrack(root,p,q,new ArrayList<>());
        System.out.println(path1);
        System.out.println(path2);
        for(int i = 0; i < path1.size(); i++)
        {
            if(path1.get(i)!= path2.get(i))
                return path1.get(i-1);
        }
        return null;
    }
    private void backtrack(TreeNode root, TreeNode p, TreeNode q, List<TreeNode> path)
    {
        if(root==null)
            return;
        if(root==p)
        {
            path1 = new ArrayList<>(path);
            path1.add(p);
            path1.add(p);
        }
        if(root==q)
        {
            path2 = new ArrayList<>(path);
            path2.add(q);
            path2.add(q);
        }
        path.add(root); //adding the node to the path
        // System.out.println(root.val);
        // System.out.println(path);


        //recursion
        if(path1.size()==0 || path2.size()==0)
            backtrack(root.left,p,q,path);
        if(path1.size()==0 || path2.size()==0)
            backtrack(root.right,p,q,path);

        //backtrack
        path.remove(path.size()-1);
        // System.out.println("The element being removed is: "+ temp.val);

    }
}



//Time complexity is O(n)
//Space complexity is O(n)