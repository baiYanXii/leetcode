package leetcode.editor.cn;

/**
 * 反转字符串
 */
public class P344_ReverseString {
    public static void main(String[] args) {
        Solution solution = new P344_ReverseString().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void reverseString(char[] s) {
            int left = 0, right = s.length - 1;
            char temp;
            while (left < right) {
                temp = s[right];
                s[right] = s[left];
                s[left] = temp;
                left++;
                right--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
