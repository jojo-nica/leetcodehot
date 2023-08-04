package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionRightView {
  public List<Integer> rightSideView(TreeNode root) {
    if(root==null) return  new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    LinkedList<TreeNode> list = new LinkedList<>();
    list.add(root);
    while(!list.isEmpty())
    {
      int size = list.size();
      while(size!=0)
      {
        TreeNode p = list.poll();
        size--;
        if(size==0) res.add(p.val);
        if(p.left!=null) list.add(p.left);
        if(p.right!=null)list.add(p.right);

      }
    }
    return  res;
  }
  class  TreeNode
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
