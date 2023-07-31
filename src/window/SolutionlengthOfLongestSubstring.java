package window;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author nica
 * @version 1.0
 */
/*
* 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。*/
public class SolutionlengthOfLongestSubstring {
  public static void main(String[] args) {
    String s = "abba";
    System.out.println(lengthOfLongestSubstring(s));
  }
  public static int lengthOfLongestSubstring(String s) {
    if(s==null) return 0;
    HashMap<Character, Integer> map = new HashMap<>();
    int max=0;
    int currlen=0;
    for(int i=0;i<s.length();i++)
    {
      char temp = s.charAt(i);
      if(!map.containsKey(temp))
      {
        map.put(temp,i);
        max=Math.max(max,++currlen);
      }
      else
      {
        if(currlen>=i-map.get(temp)) currlen=i-map.get(temp);
        else currlen++;
        map.put(temp,i);
        max=Math.max(max,currlen);
      }
    }
    return  max;
  }
}
