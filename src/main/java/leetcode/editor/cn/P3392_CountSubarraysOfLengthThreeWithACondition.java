package leetcode.editor.cn;


public class P3392_CountSubarraysOfLengthThreeWithACondition {

    public static void main(String[] args) {
        Solution solution = new P3392_CountSubarraysOfLengthThreeWithACondition().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSubarrays(int[] nums) {
            if (nums.length < 3) {
                return 0;
            }
            int count = 0;

            for (int i = 0; i < nums.length - 2; i++) {
                int left = nums[i];
                int middle = nums[i + 1];
                int right = nums[i + 2];
                int sum = left + right;
                // 判断和为零以及中间数为0的情况
                if (sum == 0) {
                    if (middle == 0) {
                        count++;
                    }
                    continue;
                }
                if (middle / sum == 2 && middle % sum == 0) {
                    count++;
                }
            }
            return count;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}