/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= s.length <= 2 * 10⁵
 * 字符串 s 由 ASCII 字符组成
 * <p>
 * Related Topics 双指针 字符串 👍 500 👎 0
 */

package leetcode.editor.cn;

//验证回文串

import java.util.Arrays;
import java.util.HashSet;

public class P125_ValidPalindrome {

    public static void main(String[] args) {
        //测试代码
        Solution solution = new P125_ValidPalindrome().new Solution();
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            int r = 0, l = s.length() - 1;
            while (r < l) {
                while (r < l && !Character.isLetterOrDigit(s.charAt(r))) r++;
                while (r < l && !Character.isLetterOrDigit(s.charAt(l))) l--;
                if (Character.toLowerCase(s.charAt(r)) != Character.toLowerCase(s.charAt(l))) return false;
                r++;
                l--;
            }
            return true;
        }



    }
//leetcode submit region end(Prohibit modification and deletion)

}