package leetcode.editor.cn;


public class P28_FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        Solution solution = new P28_FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length() > haystack.length()) {
                return -1;
            }
            // 转换数组
            char[] haystackCharArray = haystack.toCharArray();
            char[] needleCharArray = needle.toCharArray();

            int result = -1;

            for (int i = 0; i < haystackCharArray.length; i++) {
                // 如果首位相同，则开始往后便利判断是否为子串
                if (haystackCharArray[i] == needleCharArray[0]) {
                    // 标志位
                    int res = -1;
                    for (int i1 = 0; i1 < needleCharArray.length; i1++) {
                        // 如果两个不相等的话
                        res = i;
                        if (i + i1 >= haystackCharArray.length) {
                            res = -1;
                            break;
                        }
                        if (haystackCharArray[i + i1] != needleCharArray[i1]) {
                            // 初始化i的下标
                            res = -1;
                            break;
                        }
                    }
                    if (res != -1) {
                        result = res;
                        break;
                    }
                }
            }
            return result;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}