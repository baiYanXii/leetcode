package leetcode.editor.cn;

/**
 * 删除有序数组中的重复项
 */
public class P26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new P26_RemoveDuplicatesFromSortedArray().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            // 判断传来的数组是否为空
            if (nums.length == 0) {
                return 0;
            }
            // 使用快慢指针来更新元素，当慢指针和快指针指到的元素不相同就让慢指针指向的之前判断过相同元素的位置
            int slow = 0, fast = 0;
            while (fast < nums.length) {
                // 如果 慢指针指向的数字和快指针指向的数字不相同，则加入到新的数组中
                if (nums[slow] != nums[fast]) {
                    slow++;
                    nums[slow] = nums[fast];
                }
                fast++;
            }
            // 循环结束之后 slow 的数字是当前数组最后的那个数的下标，并不是长度，所以返回要 ++
            return ++slow;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
