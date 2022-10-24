package leetcode.editor.cn;

/**
 * 移除元素
 */
public class P27_RemoveElement {
    public static void main(String[] args) {
        Solution solution = new P27_RemoveElement().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeElement(int[] nums, int val) {
            int slow = 0, fast = 0;
            while (fast < nums.length) {
                // 如果快指针指向的不是 val 就将 val加入到数组中
                if (nums[fast] != val) {
                    nums[slow] = nums[fast];
                    slow++;
                }
                fast++;
            }
            return slow;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
