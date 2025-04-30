package leetcode.editor.cn;


public class P1295_FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        Solution solution = new P1295_FindNumbersWithEvenNumberOfDigits().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findNumbers(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                int digitSum = 0;
                int num1 = num;
                while (true) {
                    int gewei = num1 % 10;
                    num1 = num1 / 10;
                    digitSum++;
                    if (num1 == 0) {
                        break;
                    }
                }
                if (digitSum % 2 == 0) {
                    sum++;
                }

            }
            return sum;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}