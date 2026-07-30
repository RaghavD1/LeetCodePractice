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
class Solution {
    public boolean bool=false;
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        if(root==null)return ans;
        ArrayList<Integer>l=new ArrayList<>();l.add(root.val);
        dfs(root,l,root.val,targetSum);
        return ans;
    }
    private void dfs(TreeNode node,ArrayList<Integer>l,int currsum,int targetSum)
    {
        
        if(node.left==null&&node.right==null&&currsum==targetSum)
        {
            ans.add(new ArrayList<>(l));
        }
        if(node.left!=null)
        {
            l.add(node.left.val);
            dfs(node.left,l,currsum+node.left.val,targetSum);
            l.remove(l.size()-1);
        }
        if(node.right!=null)
        {
            l.add(node.right.val);
            dfs(node.right,l,currsum+node.right.val,targetSum);
            l.remove(l.size()-1);
        }
    }

}