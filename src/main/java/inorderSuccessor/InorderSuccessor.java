package inorderSuccessor;

import common.TreeNode;

/**
 * @author 王祥飞
 * @time 2021/12/24 3:40 PM
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode p) {
        if (p.right != null) {
            TreeNode q = p.right;
            while (q.left != null) {
                q = q.left;
            }
            return q;
        }


        while (p.father!=null&&p.father.right==p){
            p = p.father;
        }
        return p.father;
    }
}

public class InorderSuccessor {

    public static void main(String[] args) {

    }
}
