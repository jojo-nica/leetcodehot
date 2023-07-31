package window;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author nica
 * @version 1.0
 */
/*
* 中位数是有序序列最中间的那个数。如果序列的长度是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。

例如：
[2,3,4]，中位数是 3
[2,3]，中位数是 (2 + 3) / 2 = 2.5
给你一个数组 nums，有一个长度为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口向右移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。
示例：
给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。

*/
public class SolutionmedianSlidingWindow {
  public static void main(String[] args) {
    SolutionmedianSlidingWindow window = new SolutionmedianSlidingWindow();
    int[] nums = {1,3,-1,-3,5,3,6,7};
    int k=3;
    System.out.println(Arrays.toString(window.medianSlidingWindow(nums,k)));
  }
  public double[] medianSlidingWindow(int[] nums, int k) {
    if(nums.length==0) return  new double[]{};
    int len = nums.length;
    int maxpos=len-k;
    PriorityQueue<Integer> left = new PriorityQueue<>((a,b)->Integer.compare(b,a));
    PriorityQueue<Integer> right = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
    double[] res = new double[maxpos+1];
    for(int i=0;i<k;i++)
    {
      right.add(nums[i]);
    }
    for (int j=0;j<k/2;j++)
    {
      left.add(right.poll());
    }
    res[0]=getMid(left,right);
    for(int x=k;x<len;x++)
    {
      int a = nums[x],b=nums[x-k];
      if(a>=right.peek()) right.add(a);
      else  left.add(a);
      if(b>=right.peek()) right.remove(b);
      else  left.remove(b);
      adjust(left,right);
      res[x-k+1]=getMid(left,right);
    }
    return  res;
  }
  public  double getMid(PriorityQueue<Integer> left,PriorityQueue<Integer>right)
  {
    if(left.size()==right.size()) return left.peek()/2.0+right.peek()/2.0;
    else return (double)right.peek();
  }

  public  void adjust(PriorityQueue<Integer> left,PriorityQueue<Integer> right)
  {
  while(left.size()>right.size()) right.add(left.poll());
    while(right.size()-left.size()>1) left.add(right.poll());
  }


}
