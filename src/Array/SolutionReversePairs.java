package Array;

/**
 * @author nica
 * @version 1.0
 */
/*
* 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
示例 1:
输入: [7,5,6,4]
输出: 5
*/
public class SolutionReversePairs {
  int count =0;
  public int reversePairs(int[] nums) {
      this.count=0;
      mergeSort(nums,0,nums.length-1);
      return count;
  }

  public  void mergeSort(int[] nums,int left,int right)
  {
    if(left>= right) return;
    int mid = (left+right)/2;
    mergeSort(nums,left,mid);
    mergeSort(nums,mid+1,right);
    merge(nums,left,right,mid);
  }
  public  void  merge(int[] nums,int left,int right,int mid)
  {
    int[] temp = new int[nums.length];
    int i=left;
    int j=mid+1;
    int k=0;
    while(i<=mid && j<=right)
    {
      if(nums[i]<nums[j]) temp[k++]=nums[i++];
      else
      {
        count+=mid-i+1;
        temp[k++]=nums[j++];
      }
    }
    while(i<=mid) temp[k++]=nums[i++];
    while (j<=right)temp[k++]=nums[j++];
    for(k=0;k< temp.length;k++)
    {
      nums[left+k]= temp[k];
    }
  }


}
