package leetcode.editor.cn;

/**
 * 两数之和 II - 输入有序数组
 */
public class P167_TwoSumIiInputArrayIsSorted {
    public static void main(String[] args) {
        Solution solution = new P167_TwoSumIiInputArrayIsSorted().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            // 使用左右指针来解题，因为数组是按照升序的方式来排序的，做指针指向最小的那个数，右指针指向最大的数 寻找
            int left = 0, right = numbers.length - 1;
            while (left < right && right < numbers.length && left >= 0) {
                int i = numbers[left] + numbers[right];
                // 相等就返回，小了做指针右移，大了 右指针左移
                if (i == target) {
                    return new int[]{left + 1, right + 1};
                } else if (i < target) {
                    left++;
                } else if (i > target) {
                    right--;
                }
            }
            return new int[]{-1, -1};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
