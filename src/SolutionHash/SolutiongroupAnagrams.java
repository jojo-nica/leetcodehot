package SolutionHash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
/*
* 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

字母异位词 是由重新排列源单词的所有字母得到的一个新单词。

示例 1:

输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
输出: [["bat"],["nat","tan"],["ate","eat","tea"]]*/
public class SolutiongroupAnagrams {
  public static void main(String[] args) {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    System.out.println(groupAnagrams(strs));
  }
  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> res = new ArrayList<>();
    HashMap<String, ArrayList<String>> map = new HashMap<>();
    for(String str:strs)
    {
      char[] temp = str.toCharArray();
      Arrays.sort(temp);
      String a = new String(temp);
      ArrayList b =map.getOrDefault(a,new ArrayList<>());
      b.add(str);
      map.put(a,b);
    }
    for(String key:map.keySet())
    {
      res.add(map.get(key));
    }
    return  res;
  }
  }

