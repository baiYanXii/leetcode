package leetcode.editor.cn;

/**
 * 相交链表
 */
public class P160_IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        Solution solution = new P160_IntersectionOfTwoLinkedLists().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode pa = headA, pb = headB;
            int lenA = 0, lenB = 0;
            if (headA == null || headB == null) {
                return null;
            }
            // 找出 a和b那个链表更长一点
            while (pa.next != null) {
                pa = pa.next;
                lenA++;
            }
            while (pb.next != null) {
                pb = pb.next;
                lenB++;
            }
            pb = headB;
            pa = headA;
            // 让他们的长度相同 ,如果a 的长度长,则让a往前走几步,b也是一样的
            if (lenA > lenB) {
                for (int i = 0; i < lenA - lenB; i++) {
                    pa = pa.next;
                }
            } else {
                for (int i = 0; i < lenB - lenA; i++) {
                    pb = pb.next;
                }
            }
            // 找出交叉的节点
            while (pa != pb) {
                pa = pa.next;
                pb = pb.next;
            }
            return pa;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
