package leetcode.editor.cn;


public class P2302_CountSubarraysWithScoreLessThanK {

    public static void main(String[] args) {
        Solution solution = new P2302_CountSubarraysWithScoreLessThanK().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public long countSubarrays(int[] nums, long k) {
            // 窗口内总和
            long sum = 0;
            // 个数
            long res = 0;
            // 左端点
            int left = 0;

            for (int right = 0; right < nums.length; right++) {
                // 每往前进一步就加入一个数字的和
                sum += nums[right];
                // 如果窗口内的分数大于指定分数，，左侧的端口就要移动
                while (sum * (right - left + 1) >= k) {
                    sum -= nums[left];
                    left++;
                }
                // 如果不大于的话，加上当前窗口的内容
                res += right - left + 1;
            }
            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}