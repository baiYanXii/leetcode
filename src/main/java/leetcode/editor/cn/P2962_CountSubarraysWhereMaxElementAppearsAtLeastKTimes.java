package leetcode.editor.cn;


public class P2962_CountSubarraysWhereMaxElementAppearsAtLeastKTimes {

    public static void main(String[] args) {
        Solution solution = new P2962_CountSubarraysWhereMaxElementAppearsAtLeastKTimes().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public long countSubarrays(int[] nums, int k) {
            if (nums.length == 0) {
                return 0L;
            }
            // 最大数组
            int maxNum = nums[0];
            // 当前窗口中存在的元素数量
            int maxSum = 0;
            // 左指针
            int left = 0;
            long res = 0L;
            // 先求出整个数组中最大的数
            for (int num : nums) {
                maxNum = Math.max(maxNum, num);
            }
            for (int rigth = 0; rigth < nums.length; rigth++) {
                if (nums[rigth] == maxNum) {
                    maxSum++;
                }
                while (maxSum >= k) {
                    // 如果大于k开始移动指针
                    if (nums[left] == maxNum) {
                        maxSum--;
                    }
                    left++;
                }
                res += left;
            }

            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}