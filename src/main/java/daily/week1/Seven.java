package daily.week1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 王祥飞
 * @time 2022/1/11 11:05 AM
 * 4
 * essieb
 * a
 * xzy
 * elsie
 */
public class Seven {

    static class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();

            String[] a = new String[n];
            String[] b = new String[n];
            String[] c = new String[n];
            for (int i = 0; i < n; i++) {
                String s = scanner.nextLine();
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                c[i] = new String(chars);
                reserve(chars, 0, chars.length - 1);
                b[i] = new String(chars);

                a[i] = c[i];
            }

            Arrays.sort(b);
            Arrays.sort(c);

            for (int i = 0; i < n; i++) {
                String s = a[i];
                char[] chars = s.toCharArray();
                s = new String(chars);

                int l = 0, r = n - 1;
                while (l != r) {
                    int mid = l + r >> 1;
                    if (b[mid].compareTo(s) >= 0) {
                        r = mid;
                    } else {
                        l = mid + 1;
                    }
                }
                System.out.printf("%d ", l+1);
                l = 0;
                r = n - 1;

                reserve(chars, 0, chars.length - 1);
                s = new String(chars);

                while (l != r) {
                    int mid = l + r + 1 >> 1;
                    if (c[mid].compareTo(s) <= 0) {
                        l = mid;
                    } else {
                        r = mid - 1;
                    }
                }
                System.out.printf("%d\n", l+1);
            }
        }

        public static void reserve(char[] chars, int left, int right) {
            while (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
    }
}
