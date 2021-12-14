package buildTree;

import node.TreeNode;

import java.util.HashMap;

/**
 * @author 王祥飞
 * @time 2021/12/7 6:57 PM
 * 给定：
 * 前序遍历是：[3, 9, 20, 15, 7]
 * 中序遍历是：[9, 3, 15, 20, 7]
 * 返回：[3, 9, 20, null, null, 15, 7, null, null, null, null]
 * 返回的二叉树如下所示：
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */
class Solution {

    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        dfs(0, preorder.length - 1, 0, inorder.length - 1);
    }

    private void dfs(int i, int i1, int i2, int i3) {

    }
}

public class BuildTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.buildTree()
    }
}


