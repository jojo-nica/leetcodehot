package Array;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionRain {
  public int trap(int[] height) {
      int length = height.length;
      int max=0;
      int maxpos=0;
      for(int i=0;i<length;i++)
      {
        if(height[i]>max)
        {
          max=height[i];
          maxpos=i;
        }
      }
      max=0;
      int res=0;
      for(int i=0;i<maxpos;i++)
      {
        if(height[i]>=max) max=height[i];
        else res+=max-height[i];
      }
      max=0;
      for (int i=length-1;i>maxpos;i--)
      {
        if(height[i]>=max) max=height[i];
        else res+=max-height[i];
      }
      return res;
  }
}
