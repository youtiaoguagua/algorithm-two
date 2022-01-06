package daily.week1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 王祥飞
 * @time 2022/1/5 6:52 PM
 */
public class Three {

    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            char[][] chars = new char[m][n];
            scanner.nextLine();
            for (int i = 0; i < m; i++) {
                String s = scanner.nextLine();
                chars[i] = s.toCharArray();
            }
            for (int i = 0; i < m; i++) {
                System.out.println(Arrays.toString(chars[i]));
            }
            for (int i = 0; i < blocks.length; i++) {
                blocks[i] = new LinkedList<>();
            }
            solve(m, n, chars);
        }

        private static final LinkedList<Pair>[] blocks = new LinkedList[2];

        private static int[] a = {1, -1, 0, 0}, b = {0, 0, 1, -1};

        private static void solve(int m, int n, char[][] chars) {
            for (int i = 0, t = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(i + "," + j);
                    if (chars[i][j] == 'X') {
                        dfs(i, j, chars, blocks[t++]);
                    }
                }
            }

            int res = Integer.MAX_VALUE;
            for (Pair x : blocks[0]) {
                for (Pair y : blocks[1]) {
                    res = Math.min(res, Math.abs(x.a - y.a) + Math.abs(x.b - y.b));
                }
            }
            System.out.println(res - 1);
        }

        private static void dfs(int i, int j, char[][] chars, LinkedList<Pair> block) {
            chars[i][j] = 'Y';
            block.add(new Pair(i, j));
            for (int k = 0; k < 4; k++) {
                int x = i + a[k], y = j + b[k];
                if (x >= 0 && x < chars.length && y >= 0 && y < chars[0].length && chars[x][y] == 'X') {
                    dfs(x, y, chars, block);
                }
            }
        }

        static class Pair {

            public int a;
            public int b;

            public Pair(int a, int b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}
