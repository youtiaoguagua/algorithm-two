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

    private HashMap<Integer, Integer> map;
    private int[] preorder;
    private int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

        map = new HashMap<>(inorder.length);
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode dfs = dfs(0, preorder.length - 1, 0, inorder.length - 1);

        return dfs;
    }

    private TreeNode dfs(int l, int r, int x, int y) {
        if (l>r||x>y){
            return null;
        }
        TreeNode root = new TreeNode(preorder[l]);

        Integer index = map.get(preorder[l]);
        int len = index - x;

        root.left = dfs(l+1, l + len, x, index-1);
        root.right = dfs(l + len + 1, r, index + 1, y);
        return root;

    }
}

public class BuildTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3, 9, 20, 15, 7};
        int[] b = {9, 3, 15, 20, 7};
        solution.buildTree(a,b);
    }
}


