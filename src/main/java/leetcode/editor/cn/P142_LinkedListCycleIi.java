package leetcode.editor.cn;

/**
 * 环形链表 II
 */
public class P142_LinkedListCycleIi {
    public static void main(String[] args) {
        Solution solution = new P142_LinkedListCycleIi().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            // 判空
            if (head == null) {
                return null;
            }
            // 这道题同样是使用快慢指针来进行操作的,先要判断是否存在环，然后再找出环的第一个节点
            ListNode slow = head, fast = head;
            // 这里不对 fast.next.next 判断是因为，要包含如果 fast.next.next 刚好指到最后一个节点的情况
            while (fast != null && fast.next != null) {
                // 快指针走两步
                fast = fast.next.next;
                // 慢指针走一步
                slow = slow.next;
                // 如果想到等则代表存在环
                if (slow == fast) {
                    break;
                }
            }
            // 判断是因为存在环导致循环结束，还是没有环结束的,如果为null 则代表不存在环
            if (fast == null || fast.next == null) {
                return null;
            }
            // 开始寻找环的头节点
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
