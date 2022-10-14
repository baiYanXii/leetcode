package leetcode.editor.cn;

/**
 * 两数之和
 */
public class P1_TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1_TwoSum().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int i1 = i + 1; i1 < nums.length; i1++) {
                    if (nums[i] + nums[i1] == target) {
                        result[0] = i;
                        result[1] = i1;
                        return result;
                    }
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
