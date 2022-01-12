package daily.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Author youtiaoguagua
 * @create 2022/1/9 20:30
 */
public class Five {

    static class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            int[] h = new int[n + 2];
            for (int i = 1; i <= n; i++) {
                String s = reader.readLine();
                h[i] = Integer.parseInt(s);
            }

            int[] t = new int[n + 2];
            int j = 1;
            for (int i = 1; i <= n; i++) {
                if (h[i] != t[j]) {
                    t[j] = h[i];
                    j++;
                    while (h[i + 1] == h[i]) {
                        i++;
                    }
                }
            }
            n = j-1;
            h = t;
            Pair[] p = new Pair[n];
            for (int i = 1; i <= n; i++) {
                p[i - 1] = new Pair(h[i], i);
            }
            Arrays.sort(p, Comparator.comparingInt(a -> a.x));

            int res = 1, cnt = 1;
            for (int i = 0; i < n; i++) {
                int k = p[i].y;

                if (h[k - 1] < h[k] && h[k + 1] < h[k]) {
                    cnt -= 1;
                } else if (h[k - 1] > h[k] && h[k + 1] > h[k]) {
                    cnt += 1;
                }

                if (i+1<n&&p[i].x != p[i + 1].x) {
                    res = Math.max(res, cnt);
                }
            }

            System.out.println(res);
            reader.close();
        }

        static class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
    }


    static class Main1 {


        public static void main(String[] args) throws IOException {
            HashSet<Integer> all = new HashSet<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(reader.readLine());
            int[] nums = new int[n];
            int min = Integer.MAX_VALUE, max = 0;
            for (int i = 0; i < n; i++) {
                int t = Integer.parseInt(reader.readLine());
                nums[i] = t;
                min = Math.min(min, t);
                max = Math.max(max, t);
                all.add(t);
            }

            int res = 0;
            for (int h = min; h < max; h++) {
                if (!all.contains(h)) {
                    continue;
                }
                int count = 0;
                int l = 0;
                int r = nums.length - 1;
                while (nums[l] <= h) {
                    l++;
                }
                while (nums[r] <= h) {
                    r--;
                }
                for (int i = l; i <= r; i++) {
                    if (nums[i] <= h) {
                        count += 1;
                        while (nums[i] <= h && i <= r) {
                            i++;
                        }
                    }
                }
                res = Math.max(res, count + 1);

            }
            System.out.println(res);
            reader.close();

        }
    }
}
