package twoFind;

/**
 * @author nica
 * @version 1.0
 */
///*
// 请实现有重复数字的升序数组的二分查找。
//输出在数组中第一个大于等于查找值的位置（下标从1开始算起），如果数组中不存在这样的数(指不存在大于等于查找值的数)，则输出数组长度加一。
//示例1
//输入：
//5,4,[1,2,4,4,5]
//复制
//返回值：
//3
//复制
//说明：
//输出位置从1开始计算    */
public class Solutionupper_bound_ {
  public static void main(String[] args) {
    int[] input = {1,2,3,3,3};
    int n=5;
    int v=4;
    System.out.println(upper_bound_(n,v,input));

  }
  public static int upper_bound_ (int n, int v, int[] a) {
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
          int mid = (right-left)/2+left;
          if(a[mid]<v) left=mid+1;
          else if(a[mid]>=v) right=mid;
        }
        if(left>=a.length-1 && a[left]<v) return  a.length+1;
        else return left+1;
  }
}
