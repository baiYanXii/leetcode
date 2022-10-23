package leetcode.editor.cn;

import leetcode.editor.cn.P141_LinkedListCycle.ListNode;

/**
 * 环形链表
 */
public class P141_LinkedListCycle {
    public static void main(String[] args) {
        Solution solution = new P141_LinkedListCycle().new Solution();

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
        public boolean hasCycle(ListNode head) {
            // 判断如果传来的时候 head 就为空的情况
            if (head == null) {
                return false;
            }
            // 思路：使用快慢指针，如果存在环那么快慢指针一定会相遇，且快指针的下一个节点和下下个节点不为 null
            ListNode slow = head, fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
