package Tree;

import java.util.ArrayList;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionkthLargest {
  ArrayList<Integer> res = new ArrayList<>();
  public int kthLargest(TreeNode root, int k) {
    midorder(root);
    return res.get(res.size()-k);

  }
  void midorder(TreeNode root)
  {
    if(root==null) return;
    midorder(root.left);
    res.add(root.val);
    midorder(root.right);
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
