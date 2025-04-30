package leetcode.editor.cn;


public class P136_SingleNumber {

    public static void main(String[] args) {
        Solution solution = new P136_SingleNumber().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;
            for (int num : nums) {
                res ^= num;
            }

            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}