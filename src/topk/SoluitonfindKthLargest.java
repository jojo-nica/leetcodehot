package topk;

/**
 * @author nica
 * @version 1.0
 */
public class SoluitonfindKthLargest {
  public static void main(String[] args) {
    SoluitonfindKthLargest largest = new SoluitonfindKthLargest();
    int[] input = {2,1};
    int k= 2;
    System.out.println(largest.findKthLargest(input,k));
  }
  int k;
  public int findKthLargest(int[] nums, int k) {
      this.k=k;
      int target = nums.length-k;
      quickSort(nums,0,nums.length-1,target);
      return  nums[target];
  }
  public  int dosort(int[] nums,int left,int right)
  {
    int pivot = left;
    int temp = nums[pivot];
    while (left<right)
    {
      while (left<right && temp<nums[right]) right--;
      if(left<right)
      {
        nums[left]=nums[right];
        pivot=right;
      }
      while (left<right && temp>=nums[left]) left++;
      if(left<right)
      {
        nums[right]=nums[left];
        pivot=left;
      }
    }
    nums[pivot]=temp;
    return pivot;
  }

  public void quickSort(int[] nums,int left,int right,int target)
  {
    if(left<right)
    {
      int pivot = dosort(nums,left,right);
      if(pivot==target) return;
      if(pivot<target)  quickSort(nums,pivot+1,right,target);
      if(pivot>target) quickSort(nums,left,pivot-1,target);
    }
  }
}
