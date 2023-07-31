package window;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author nica
 * @version 1.0
 */
/*
* 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。

示例:

输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
输出: [3,3,5,5,6,7]
解释:
*/
public class SolutionmaxSlidingWindow {
  public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
    System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
  }
  public static int[] maxSlidingWindow(int[] nums, int k) {
    LinkedList<Integer> list = new LinkedList<>();
    int[] res = new int[nums.length-k+1];
    int left;
    int right;
    for(right=0;right< nums.length;right++)
    {
      while (!list.isEmpty() && nums[list.getLast()]<nums[right]) list.removeLast();
      list.add(right);
      left=right-k+1;
      if(left>list.peek()) list.removeFirst();
      if(right>=k-1) res[left]=nums[list.peek()];
    }
    return  res;
  }
}
