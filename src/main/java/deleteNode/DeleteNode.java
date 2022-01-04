package deleteNode;

import node.ListNode;

/**
 * @author 王祥飞
 * @time 2022/1/4 2:35 PM
 * 链表 1->4->6->8
 * 删掉节点：第2个节点即6（头节点为第0个节点）
 * 输出：新链表 1->4->8
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

public class DeleteNode {
}
