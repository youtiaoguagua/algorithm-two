package daily.week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王祥飞
 * @time 2022/1/5 1:31 PM
 */
public class Two {

    static public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] s = scanner.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[] nums = new int[n + 2];

            for (int i = 1; i <= m; i++) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                solve(l, r, nums);
            }

            for (int i = 1; i <= n; i++) {
                nums[i] += nums[i - 1];
            }

            nums = Arrays.copyOfRange(nums, 1, nums.length - 1);
            Arrays.sort(nums);
            int i = (nums.length) / 2;
            System.out.println(nums[i]);
        }

        private static void solve(int l, int r, int[] nums) {
            nums[l] += 1;
            nums[r + 1] -= 1;
        }
    }
}
