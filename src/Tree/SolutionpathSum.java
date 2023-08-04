package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionpathSum {
  List<List<Integer>> res = new ArrayList<>();
  LinkedList<Integer> path = new LinkedList<>();
  public List<List<Integer>> pathSum(TreeNode root, int target) {
        findsum(root,target);
        return  res;
  }
  void findsum(TreeNode root,int target)
  {
    if(root==null) return;
    path.add(root.val);
    target-=root.val;
    if(target==0 && root.left==null && root.right==null) res.add(new ArrayList<>(path));
    findsum(root.left,target);
    findsum(root.right,target);
    path.removeLast();
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
