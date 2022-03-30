/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 10⁴
 * -10⁴ <= nums[i] <= 10⁴
 * nums 已按 非递减顺序 排序
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：
 * <p>
 * <p>
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 * <p>
 * Related Topics 数组 双指针 排序 👍 482 👎 0
 */

package leetcode.editor.cn;

//有序数组的平方

import java.util.Arrays;

public class P977_SquaresOfASortedArray {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P977_SquaresOfASortedArray().new Solution();
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
/*
时间复杂度太高了选择使用双指针重新做
            int[] ints = Arrays.stream(nums).map(n -> n * n).sorted().toArray();

            return ints;*/
            int[] newNums = new int[nums.length];
            int i = 0, j = nums.length - 1;
            int newJ = nums.length - 1;
            while (i <= j) {
                if ((nums[i] * nums[i]) > (nums[j] * nums[j])) {
                    newNums[newJ--] = nums[i] * nums[i];
                    i++;
                } else {
                    newNums[newJ--] = nums[j] * nums[j];
                    j--;
                }
            }

            return newNums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}