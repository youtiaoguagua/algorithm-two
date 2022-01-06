package deleteDuplication;

import common.ListNode;

/**
 * @author 王祥飞
 * @time 2022/1/4 2:58 PM
 */
class Solution {
    public ListNode deleteDuplication(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode p = pre;
        while (p.next!=null){
            ListNode q = p.next;
            while (q!=null&&p.next.val==q.val){
                q = q.next;
            }
            if (p.next.next==q){
                p = p.next;
            }else {
                p.next = q;
            }

        }
        return pre.next;
    }
}

public class DeleteDuplication {
}


