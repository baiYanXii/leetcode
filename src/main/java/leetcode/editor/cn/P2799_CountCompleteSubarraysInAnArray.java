package leetcode.editor.cn;


import java.util.*;

public class P2799_CountCompleteSubarraysInAnArray {

    public static void main(String[] args) {
        Solution solution = new P2799_CountCompleteSubarraysInAnArray().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countCompleteSubarrays(int[] nums) {
            // 计算种类的个数
            Set<Integer> set = new HashSet<>();
            for (int x : nums) {
                set.add(x);
            }
            int k = set.size();

            // 创建hash表
            Map<Integer, Integer> cnt = new HashMap<>(k);
            int ans = 0;
            int left = 0;
            for (int x : nums) {
                // 如果key相同 value +1
                cnt.merge(x, 1, Integer::sum);
                // 如果加到集合内的种类是 k,则左侧前进，找出种类不等于 k的极限
                while (cnt.size() == k) {
                    int out = nums[left];
                    // 如果该种类存在的个数为0则代表当前种类已经没有
                    if (cnt.merge(out, -1, Integer::sum) == 0) {
                        cnt.remove(out);
                    }
                    left++;
                }
                // 每满足一种情况就加一种情况
                ans += left;
            }
            return ans;
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)


}