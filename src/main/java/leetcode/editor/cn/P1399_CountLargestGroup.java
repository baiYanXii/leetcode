package leetcode.editor.cn;


import java.util.HashMap;

public class P1399_CountLargestGroup {

    public static void main(String[] args) {
        Solution solution = new P1399_CountLargestGroup().new Solution();
        // put your test code here
        solution.countLargestGroup(13);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countLargestGroup(int n) {
            // 存放结果内容 值和对应的数字个数
            HashMap<Integer, Integer> resultMap = new HashMap<>();
            // 最大的数组长度
            int maxSize = 0;
            for (int i = 1; i <= n; i++) {
                // 表示末尾的值
                int value = i;
                // 表示总和
                int sum = 0;
                while (true) {
                    int lastNum = value % 10;
                    sum += lastNum;
                    value = value / 10;

                    if (value <= 0) {
                        if (resultMap.containsKey(sum)) {
                            resultMap.put(sum, resultMap.get(sum) + 1);
                        } else {
                            resultMap.put(sum, 1);
                        }
                        break;
                    }
                }
                maxSize = Math.max(maxSize, resultMap.get(sum));
            }
            int finalMaxSize = maxSize;

            return (int) resultMap.values().stream().filter(value -> value.equals(finalMaxSize)).count();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}