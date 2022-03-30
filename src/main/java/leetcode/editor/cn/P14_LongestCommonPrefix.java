/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * <p>
 * Related Topics 字符串 👍 2141 👎 0
 */

package leetcode.editor.cn;

//最长公共前缀

public class P14_LongestCommonPrefix {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P14_LongestCommonPrefix().new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"123", "3123"}));
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0)
                return "";
            if (strs.length == 1)
                return strs[0];

            String temp = strs[0];
            for (int i = 1; i < strs.length; i++) {
                int j = 0;
                int strLength = temp.length();

                if (temp.length() > strs[i].length())
                    strLength = strs[i].length();

                for (; j < strLength; j++) {
                    if (temp.charAt(j) != strs[i].charAt(j)) {
                        break;
                    }
                }
                temp = temp.substring(0, j);
                if (temp.length() == 0)
                    return "";
            }
            return temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}