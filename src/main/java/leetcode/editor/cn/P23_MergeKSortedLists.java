package leetcode.editor.cn;

import java.util.PriorityQueue;

/**
 * 合并K个升序链表
 */
public class P23_MergeKSortedLists {
    public static void main(String[] args) {
        Solution solution = new P23_MergeKSortedLists().new Solution();

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
        public ListNode mergeKLists(ListNode[] lists) {
            // 判断传来的 链表个数是不是空的
            if (lists.length == 0) {
                return null;
            }
            // 创建虚拟头节点
            ListNode result = new ListNode();
            ListNode p = result;
            // 创建优先队列 先将链表数组中每个链表的第一位（也就是最小的那个）存储到优先队列中 按照升序的方式进行排列
            PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, (o1, o2) -> o1.val - o2.val);
            // 先将链表数组中的每个链表的最小的元素放入优先队列中
            for (ListNode list : lists) {
                if (list != null) {
                    priorityQueue.add(list);
                    // 存储完成之后指向下一个节点
                    list = list.next;
                }
            }
            // 对优先队列中存储的元素的最小值加入到 结果链表中
            while (!priorityQueue.isEmpty()) {
                // 取出优先队列中的最小元素
                ListNode poll = priorityQueue.poll();
                // p指向的是当前节点
                p.next = poll;
                // 将当前最小值的下一个节点存入到优先队列中
                if (poll.next != null) {
                    priorityQueue.add(poll.next);
                }
                p = p.next;
            }
            return result.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
