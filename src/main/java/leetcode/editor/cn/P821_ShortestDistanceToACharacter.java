package leetcode.editor.cn;

import java.util.ArrayList;

/**
 * 字符的最短距离
 */
public class P821_ShortestDistanceToACharacter {
  public static void main(String[] args) {
    Solution solution = new P821_ShortestDistanceToACharacter().new Solution();

  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int[] shortestToChar(String s, char c) {
      int[] ints = new int[s.length()];
      ArrayList<Integer> integers = new ArrayList<>();
      for (int i = 0; i < s.length(); i++)
        if (s.charAt(i) == c)
          integers.add(i);

      for (int i = 0; i < s.length(); i++) {
        int min = Integer.MAX_VALUE;
        for (Integer integer : integers) {
          if (min >= Math.abs(i - integer))
            min = Math.abs(i - integer);
        }
        ints[i] = min;
      }
      return ints;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
