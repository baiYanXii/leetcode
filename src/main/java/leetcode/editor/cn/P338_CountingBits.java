package leetcode.editor.cn;


public class P338_CountingBits {

    public static void main(String[] args) {
        Solution solution = new P338_CountingBits().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n + 1];
//            for (int i = 0; i <= n; i++) {
            // 方法一
//                int num = i;
//                int yu = 0;
//                int sum = 0;
//                while (true) {
//                    yu = num % 2;
//                    num = num / 2;
//                    if (yu == 1) {
//                        sum++;
//                    }
//                    if (num <= 0) {
//                        break;
//                    }
//                }
//                ans[i] = sum;

//                方法2
//                ans[i] = Integer.bitCount(i);
//                }


//            方法3
//            对于所有的数字，只有两类：
//            奇数：二进制表示中，奇数一定比前面那个偶数多一个 1，因为多的就是最低位的 1。
//            举例：
//            0 = 0       1 = 1
//            2 = 10      3 = 11
//            偶数：二进制表示中，偶数中 1 的个数一定和除以 2 之后的那个数一样多。因为最低位是 0，除以 2 就是右移一位，也就是把那个 0 抹掉而已，所以 1 的个数是不变的。
//            举例：
//            2 = 10       4 = 100       8 = 1000
//            3 = 11       6 = 110       12 = 1100
//            另外，0 的 1 个数为 0，于是就可以根据奇偶性开始遍历计算了。

            ans[0] = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    ans[i] = ans[i - 1] + 1;
                } else {
                    ans[i] = ans[i / 2];
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}