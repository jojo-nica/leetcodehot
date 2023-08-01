package Array;

import java.util.LinkedList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionSpiralOrder {
  public List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length;;
        int n=matrix[0].length;
        int[][] spiral = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][] visited = new boolean[m][n];
    LinkedList<Integer> list = new LinkedList<>();
        int index=0;
        int nextColumn=1,nextrow=1;
        int row=0,column=0;
        for(int i=0;i<m*n;i++)
        {
          list.add(matrix[row][column]);
          visited[row][column]=true;
          nextrow=row+spiral[index][0];
          nextColumn=column+spiral[index][1];
          if(nextrow>=m || nextColumn>=n || nextrow<0 || nextColumn<0 || visited[nextrow][nextColumn])
          {
             index=(index+1)%4;
          }
          row = row+spiral[index][0];
          column = column+spiral[index][1];
        }
        return  list;
  }
}
