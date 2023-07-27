package SolutionHash;

import java.util.HashSet;

/**
 * @author nica
 * @version 1.0
 */
/*
* 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。

请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
输入：nums = [100,4,200,1,3,2]
输出：4
解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。*/
public class SolutionlongestConsecutive {
  public static void main(String[] args) {
    int[] nums = {0,3,7,2,5,8,4,6,0,1};
    System.out.println(longestConsecutive(nums));
  }
  public  static int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    int max=0;
    for(int num:nums)
    {
      set.add(num);
    }
    for(int num:set)
    {

      int cur=num;
      if(!set.contains(cur-1))
      {
        int len=1;
        while (set.contains(cur+1))
        {
          len++;
          cur++;
        }
        max=Math.max(len,max);
      }
    }
    return max;
  }
}
