package Array;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionMaxArea {
  public int maxAreaOfIsland(int[][] grid) {
      int m=grid.length;
      int n=grid[0].length;
      int max=0;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(grid[i][j]==1)
          {
            max=Math.max(dfsSearchArea(grid,i,j),max);
          }
        }
      }
      return max;

  }
  public  int dfsSearchArea(int [][] grid,int i,int j)
  {
    if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || grid[i][j]==0)
    {
      return 0;
    }
    int count =0;
    grid[i][j]=0;
    count+=dfsSearchArea(grid,i-1,j);
    count+=dfsSearchArea(grid,i+1,j);
    count+=dfsSearchArea(grid,i,j-1);
    count+=dfsSearchArea(grid,i,j+1);
    return  count;
  }

}
