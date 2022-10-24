package leetcode.editor.cn;

/**
 * 删除排序链表中的重复元素
 */
public class P83_RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Solution solution = new P83_RemoveDuplicatesFromSortedList().new Solution();

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
        public ListNode deleteDuplicates(ListNode head) {
            // 判空
            if (head == null) {
                return head;
            }
            ListNode slow = head, fast = head;
            // fast 不为空就代表，fast没有指向最后一个节点的下一个节点。
            while (fast != null) {
                // 如果慢指针指向的按个值 不和 快指针指向的值相同的话，就将这个值添加到链表中
                if (slow.val != fast.val) {
                    slow = slow.next;
                    slow.val = fast.val;
                }
                fast = fast.next;
            }
            // 将这个链表最后的值的下一个节点指向 null
            slow.next = null;
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
