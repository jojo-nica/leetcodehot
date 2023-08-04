package Tree;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionMaxdepth {
  public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
  }

  class TreeNode
  {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
      this.val=val;
    }

  }
}
