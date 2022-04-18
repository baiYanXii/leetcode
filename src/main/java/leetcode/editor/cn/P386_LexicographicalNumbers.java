package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 字典序排数
 */
public class P386_LexicographicalNumbers {
  public static void main(String[] args) {
    Solution solution = new P386_LexicographicalNumbers().new Solution();

  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    List<Integer> ll = new ArrayList<Integer>();
    int n;

    public List<Integer> lexicalOrder(int n) {
      this.n = n;
      for (int i = 1; i <= 9; i++)
        dfs(i);
      return ll;
    }

    public void dfs(int k) {
      if (k > n)
        return;
      ll.add(k);
      if (k * 10 > n) return;
      for (int i = 1; i <= 9; i++)
        dfs(k * 10 + i);
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
