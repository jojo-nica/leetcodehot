package twoFind;

/**
 * @author nica
 * @version 1.0
 */
/*
* 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。

由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。

注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
示例 1：

输入：x = 4
输出：2
*/
public class SolutionmySqrt {
  public static void main(String[] args) {
    int x=2147395599;
    System.out.println(mySqrt(x));
  }
  public static int mySqrt(int x) {
        if(x==1)return 1;
        if(x==0)return  0;
        int left = 1,right = x/2;
        while(left<=right)
        {
          int mid = (right-left)/2+left;
          int temp = x/mid;
          if(temp==mid) return  mid;
          else if(temp<mid) right=mid-1;
          else  left=mid+1;
        }
        return right;
  }
}
