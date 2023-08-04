package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
/*
* 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
* 第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
例如:
给定二叉树: [3,9,20,null,null,15,7],*/
public class SolutionlevelOrder {
  public List<List<Integer>> levelOrder(TreeNode root) {
    if(root==null) return  new ArrayList<>();
    LinkedList<TreeNode> list = new LinkedList<>();
    ArrayList<List<Integer>> res = new ArrayList<>();
    list.add(root);
    int i=1;
    while (!list.isEmpty())
    {
      ArrayList<Integer> temp = new ArrayList<>();
      LinkedList<Integer> convert = new LinkedList<>();
      int size = list.size();
      while(size!=0)
      {
        TreeNode p = list.pop();
        size--;
        if(i%2!=0) convert.add(p.val);
        else  convert.addFirst(p.val);
        if(p.left!=null) list.add(p.left);
        if(p.right!=null)list.add(p.right);
      }
      i++;
      temp.addAll(convert);
      res.add(temp);
    }
    return  res;
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
