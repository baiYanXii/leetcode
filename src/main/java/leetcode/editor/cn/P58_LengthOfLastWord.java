package leetcode.editor.cn;


public class P58_LengthOfLastWord {

    public static void main(String[] args) {
        Solution solution = new P58_LengthOfLastWord().new Solution();
        // put your test code here

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
            int wordLength = 0;
            int lastLength = 0;
            char[] charArray = s.toCharArray();

            for (char c : charArray) {
                // 如果碰到空格
                if (c == ' ') {
                    // 判断是不是连续空格的情况
                    if (wordLength != 0) {
                        lastLength = wordLength;
                    }
                    wordLength = 0;
                    continue;
                }
                wordLength++;
            }
            // 如果最后一个单词的后边是空格就给最近一个单词的长度
            if (wordLength == 0) {
                wordLength = lastLength;
            }
            return wordLength;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}