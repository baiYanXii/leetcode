package leetcode.editor.cn;

/**
 * 分隔链表
 */
public class P86_PartitionList {
    public static void main(String[] args) {
        Solution solution = new P86_PartitionList().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode partition(ListNode head, int x) {
            // 存储比 x 小的节点
            ListNode small = new ListNode(), smallP = small;
            // 存储比 x 大的节点
            ListNode big = new ListNode(), bigP = big;
            // 对总链表进行遍历
            while (head != null) {
                // 对小于 x 的节点进行操作
                if (head.val < x) {
                    // 存储小的指针存储 小数
                    smallP.next = head;
                    // 跳转到这个 比 x 小的节点
                    smallP = smallP.next;
                } else {
                    bigP.next = head;
                    bigP = bigP.next;
                }
                // 头节点跳转到下一个节点，并且把上一个节点的 next 设置为 null
                ListNode temp = head.next;
                head.next = null;
                head = temp;
            }
            smallP.next = big.next;
            return small.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
