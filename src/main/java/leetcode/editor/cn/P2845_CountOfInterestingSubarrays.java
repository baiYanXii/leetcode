package leetcode.editor.cn;


import java.util.HashMap;
import java.util.List;

public class P2845_CountOfInterestingSubarrays {

    public static void main(String[] args) {
        Solution solution = new P2845_CountOfInterestingSubarrays().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
            // 记录当前数组中所有的值的信息，如果为 nums[i] % modulo == k ，则记录1
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) % modulo == k) {
                    hashMap.put(i, 1);
                } else {
                    hashMap.put(i, 0);
                }
            }




            return 1L;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}