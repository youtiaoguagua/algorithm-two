package daily.week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王祥飞
 * @time 2022/1/7 4:11 PM
 */
public class Dijstra {


    static class Main {

        private static int[][] nums;
        private static boolean[] st;

        private static void dijstra() {
            
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.nextLine();
            nums = new int[m+1][m+1];
            for (int i = 0; i < m; i++) {
                Arrays.fill(nums[i],Integer.MAX_VALUE);
            }
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int t = scanner.nextInt();
                scanner.nextLine();
                nums[a][b] = Math.min(t, nums[a][b]);
            }
            st = new boolean[m+1];

        }
    }

}
