package leetcode.editor.cn;

/**
 * 链表的中间结点
 */
public class P876_MiddleOfTheLinkedList {
    public static void main(String[] args) {
        Solution solution = new P876_MiddleOfTheLinkedList().new Solution();

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
        public ListNode middleNode(ListNode head) {
            // 一次性找到中间节点使用快慢指针
            // 当慢指针走一步的时候，快指针走两步，当快指针走到最后一个节点的时候，慢指针刚好指到中间的节点
            ListNode slow = head, quick = head;
            while (quick != null && quick.next != null) {
                slow = slow.next;
                quick = quick.next.next;
            }
            return slow;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
