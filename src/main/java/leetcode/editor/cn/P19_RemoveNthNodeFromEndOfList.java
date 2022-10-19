package leetcode.editor.cn;

/**
 * 删除链表的倒数第 N 个结点
 */
public class P19_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new P19_RemoveNthNodeFromEndOfList().new Solution();

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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // 设置虚拟头节点，防止空指针异常
            ListNode listNode = new ListNode();
            listNode.next = head;
            ListNode end = listNode, before = listNode;
            // 如果只有一个节点或者一个节点也没有直接返回null
            if (end.next == null) {
                return null;
            }
            // 先往前走 n+1 步，把 n 个节点暴露出来
            for (int i = 0; i < n + 1; i++) {
                end = end.next;
            }
            // 一直遍历到最后一个元素的下一个元素
            while (end != null) {
                before = before.next;
                end = end.next;
            }
            before.next = before.next.next;
            return listNode.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
