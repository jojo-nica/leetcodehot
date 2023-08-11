package topk;

import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
public class SolutiongetLeastNumbers {
  public static void main(String[] args) {
    SolutiongetLeastNumbers leastNumbers = new SolutiongetLeastNumbers();
    int[] arr = {0,1,2,1};
    int k = 1;
    System.out.println(Arrays.toString(leastNumbers.getLeastNumbers(arr,k)));
  }
  public int[] getLeastNumbers(int[] arr, int k) {
          quickSort(arr,k,0,arr.length-1);
          int[] res = new int[k];
           System.arraycopy(arr,0,res,0,k);
           return  res;
  }

  public void quickSort(int[] arr,int k,int left,int right)
  {
      if(left>=right) return;
      int pivot = doSort(arr,left,right);
      if(pivot==k-1) return;
      quickSort(arr,k,left,pivot-1);
      quickSort(arr,k,pivot+1,right);
  }

  public int doSort(int[] arr,int left, int right)
  {
    int pivot = left;
    int temp = arr[pivot];
    while (left<right)
    {
      while(left<right && temp<=arr[right]) right--;
      if(left<right)
      {
        arr[pivot]=arr[right];
        pivot=right;
      }
      while (left<right && temp>arr[left])left++;
      if(left<right)
      {
        arr[pivot]=arr[left];
        pivot=left;
      }
    }
    arr[pivot]=temp;
    return  pivot;


  }
}
