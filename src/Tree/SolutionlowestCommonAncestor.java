package Tree;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionlowestCommonAncestor {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root==null||p==root || q==root) return  root;
    TreeNode left = lowestCommonAncestor(root.left,p,q);
    TreeNode right = lowestCommonAncestor(root.right,p,q);
    if(left==null && right==null) return  null;
    else  if(left ==null && right!=null) return  right;
    else if(left!=null && right==null) return left;
    else  return  root;
  }

  class TreeNode
  {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val)
    {
      this.val=val;
    }
  }
}
