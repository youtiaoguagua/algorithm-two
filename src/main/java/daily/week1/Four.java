package daily.week1;

import java.util.Scanner;

/**
 * @author 王祥飞
 * @time 2022/1/6 4:52 PM
 * 1
 * 4 4
 * 0111
 * 0010
 * 0100
 * 1111
 * 7
 * Q
 * M 0 2 1
 * Q
 * M 2 2 0
 * Q
 * M 2 1 0
 * Q
 */
public class Four {

    static class Main {

        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int z = scanner.nextInt();
            scanner.nextLine();
            for (int k = 0; k < z; k++) {
                System.out.printf("Case #%d:\n", k + 1);
                int m = scanner.nextInt();
                int n = scanner.nextInt();
                scanner.nextLine();
                int[][] nums = new int[m][n];
                for (int i = 0; i < m; i++) {
                    char[] chars = scanner.nextLine().toCharArray();
                    for (int j = 0; j < n; j++) {
                        nums[i][j] = chars[j] - '0';
                    }
                }
                solve(m, n, nums);
            }
        }

        private static void solve(int m, int n, int[][] nums) {
            int t = scanner.nextInt();
            scanner.nextLine();
            for (int k = 0; k < t; k++) {
                String s = scanner.nextLine();
                if (s.charAt(0) == 'Q') {
                    int res = 0;
                    boolean[][] st = new boolean[m][n];
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            if (nums[i][j] == 1 && !st[i][j]) {
                                res += 1;
                                dfs(i, j, nums, st);
                            }
                        }
                    }
                    System.out.println(res);
                } else {
                    String[] z = s.split(" ");
                    int a = Integer.parseInt(z[1]);
                    int b = Integer.parseInt(z[2]);
                    int c = Integer.parseInt(z[3]);
                    nums[a][b] = c;
                }
            }

        }

        private static int[] a = {1, -1, 0, 0}, b = {0, 0, 1, -1};

        private static void dfs(int m, int n, int[][] nums, boolean[][] st) {
            st[m][n] = true;
            for (int i = 0; i < 4; i++) {
                int x = m + a[i], y = n + b[i];
                if (x >= 0 && x < nums.length && y >= 0 && y < nums[0].length && nums[x][y] == 1 && !st[x][y]) {
                    dfs(x, y, nums, st);
                }
            }

        }
    }
}
