package leetcode.editor.cn;


public class P70_ClimbingStairs {

    public static void main(String[] args) {
        Solution solution = new P70_ClimbingStairs().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            int res = 0;
            int n1 = 1;
            int n2 = 2;
            for (int i = 3; i <= n; i++) {
                res = n1 + n2;
                n1 = n2;
                n2 = res;
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}