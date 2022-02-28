package daily.week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author 王祥飞
 * @time 2022/1/26 11:10 AM
 */
public class Two {

    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();

            Pair[] nodes = new Pair[n + 1];
            int[] max = new int[n + 2];
            int[] min = new int[n + 2];
            for (int i = 1; i < n + 1; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                scanner.nextLine();
                nodes[i] = new Pair(a, b);
            }

            Arrays.sort(nodes, 1,n+1,Comparator.comparingInt(a -> a.x));

            max[1] = nodes[1].y;

            for (int i = 2; i < n + 1; i++) {
                max[i] = Math.max(max[i - 1], nodes[i].y);
            }

            min[n+1] = Integer.MAX_VALUE;
            min[n] = nodes[n].y;
            for (int i = n-1; i > 0; i--) {
                min[i] = Math.min(min[i +1], nodes[i].y);
            }

            int res = 0;
            for (int i = 1; i <n+1; i++) {
                if(nodes[i].y>=max[i] && nodes[i].y<= min[i]){
                    res++;
                }
            }
            System.out.println(res);
        }


        static class Pair {
            int x, y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }
    }
}
