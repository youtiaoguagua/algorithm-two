package hasPath;

/**
 * @author 王祥飞
 * @time 2021/12/24 4:31 PM
 * matrix=
 * [
 * ["A","B","C","E"],
 * ["S","F","C","S"],
 * ["A","D","E","E"]
 * ]
 * <p>
 * str="BCCE" , return "true"
 * <p>
 * str="ASAE" , return "false"
 */

class Solution {

    private String str;
    private char[][] matrix;

    public boolean hasPath(char[][] matrix, String str) {
        this.str = str;
        this.matrix = matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int x) {
        if (i < 0 || i >= this.matrix.length || j < 0 || j >= this.matrix[0].length || matrix[i][j] == '0' || matrix[i][j] != str.charAt(x)) {
            return false;
        }

        if (x == str.length() - 1) {
            return true;
        }
        int[] a = {0, 0, 1, -1};
        int[] b = {1, -1, 0, 0};
        char t = this.matrix[i][j];
        matrix[i][j] = '0';
        for (int k = 0; k < 4; k++) {
            int c = i + a[k], d = j + b[k];
            if (dfs(c, d, x + 1)) {
                return true;
            }
        }
        matrix[i][j] = t;
        return false;
    }
}

public class HasPath {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
