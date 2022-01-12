package daily.week2;

import java.util.*;

/**
 * @author 王祥飞
 * @time 2022/1/11 3:16 PM
 */
public class One {

    static class Main {

        private static HashMap<Integer, Integer> map = new HashMap<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();

            int start = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                String b = scanner.next();
                scanner.nextLine();
                int t = 0;
                if (b.equals("R")) {
                    t = start + a;
                    solve(start, t);
                } else {
                    t = start - a;
                    solve(t, start);
                }

                start = t;
            }

            Set<Integer> set = map.keySet();
            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            int sum = 0, res = 0, l = 0;
            for (Integer key : list) {
                Integer val = map.get(key);
                if (sum>1){
                    res+=key-l;
                }
                l = key;
                sum += val;
            }


            System.out.println(res);
        }

        private static void solve(int l, int r) {
            map.merge(l, 1, Integer::sum);
            map.merge(r , -1, Integer::sum);
        }
    }
}
