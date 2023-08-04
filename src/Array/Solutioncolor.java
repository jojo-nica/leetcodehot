package Array;

/**
 * @author nica
 * @version 1.0
 */
public class Solutioncolor {
  public static void main(String[] args) {
    String str = "RGBGRR";
    System.out.println(findColor(str));
  }
  public  static int findColor(String str)
  {
      int count=1;
      char color = str.charAt(0);
      for(int i=1;i<str.length();i++)
      {
        char temp = str.charAt(i);
        if(temp!=color)
        {
          count++;
          color=temp;
        }
      }
    System.out.println(count);
      int res_count=1;
      char res_color=str.charAt(0);
      for(int i=1;i<str.length();i++)
      {
        char temp=str.charAt(i);
        if(temp != res_color)
        {
          if(!((temp=='G' && res_color=='B')  || (temp=='B'&& res_color=='G')))
          {
            res_count++;
            res_color=temp;
          }
        }
      }
      return  count-res_count;
  }
}
