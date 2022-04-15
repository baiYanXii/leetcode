/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。
 * 如果不存在符合条件的子数组，返回 0 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= target <= 10⁹
 * 1 <= nums.length <= 10⁵
 * 1 <= nums[i] <= 10⁵
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：
 * <p>
 * <p>
 * 如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。
 * <p>
 * Related Topics 数组 二分查找 前缀和 滑动窗口 👍 1038 👎 0
 */

package leetcode.editor.cn;

//长度最小的子数组

public class P209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new P209_MinimumSizeSubarraySum().new Solution();
        int[] test = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(solution.minSubArrayLen(7, test));
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
//            int sum = 0; //存储个数
//            for (int i = 0; i < nums.length; i++) {
//
//                if (nums[i] >= target)
//                    return 1;
////
////                if (i == nums.length - 1 && nums[i] >= target)
////                    return 1;
////                else if (i == nums.length - 1)
////                    return sum;
//
//                int temp = nums[i]; //存储目前的值
//                int tempSum = 1;
//
//                for (int j = i + 1; j < nums.length; j++) {
//                    temp += nums[j];
//                    tempSum++;
//                    if (temp >= target) {
//                        if (sum == 0)
//                            sum = tempSum;
//                        if (sum > tempSum)
//                            sum = tempSum;
//                        break;
//                    }
//                }
//
//            }
//            return sum;

//            更优解
            int right = 0, leaf = 0;
            int sum = 0;
            int result = Integer.MAX_VALUE;
            for (; right < nums.length; right++) {
                sum += nums[right];
                while (sum >= target) {
                    result = Math.min(result, right - leaf + 1);
                    sum -= nums[leaf++];
                }
            }
            return result == Integer.MAX_VALUE ? 0 : result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}