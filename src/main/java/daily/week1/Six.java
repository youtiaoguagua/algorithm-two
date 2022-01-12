package daily.week1;

import java.util.*;

/**
 * @author 王祥飞
 * @time 2022/1/11 10:20 AM
 */
public class Six {

    static class Main {

        private static char[][] chars;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();
            chars = new char[n][n];
            for (int i = 0; i < n; i++) {
                chars[i] = scanner.nextLine().toCharArray();
            }

            if (chars[0][0] == '(') {
                dfs(0, 0, 1, 0);
            }
            System.out.println(res);

        }

        private static int res = 0;
        private static int[] da = {0, 0, 1, -1};
        private static int[] db = {1, -1, 0, 0};

        private static void dfs(int x, int y, int l, int r) {
            char t = chars[x][y];
            chars[x][y] = '*';
            if (l == r) {
                res = Math.max(res, l + r);
                chars[x][y] = t;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int a = x + da[i], b = y + db[i];
                if (a >= 0 && a < chars.length && b >= 0 && b < chars[0].length && chars[a][b] != '*') {
                    if (!(t == ')' && chars[a][b] == '(')) {
                        if (chars[a][b] == '(') {
                            dfs(a, b, l + 1, r);
                        } else if (chars[a][b] == ')') {
                            dfs(a, b, l, r + 1);
                        }
                    }
                }
            }
            chars[x][y] = t;
        }
    }
}
