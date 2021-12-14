package printListReversingly;

import node.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
/**
 * @author 王祥飞
 * @time 2021/12/7 5:49 PM
 */

/**
 * Definition for singly-linked list.
 * class node.ListNode {
 * int val;
 * node.ListNode next;
 * node.ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private final ArrayList<Integer> a = new ArrayList<>();

    public int[] printListReversingly(ListNode head) {
        while (head != null) {
            a.add(head.val);
            head = head.next;
        }
        int[] ints = new int[a.size()];
        for (int i = 0,j=ints.length-1; i < a.size(); i++,j--) {
            ints[j] = a.get(i);
        }
        return ints;
    }
}

public class PrintListReversingly {
    public static void main(String[] args) {

    }
}
