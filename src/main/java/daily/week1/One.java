package daily.week1;

import java.util.Scanner;

/**
 * @author 王祥飞
 * @time 2022/1/5 12:36 PM
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.nextLine().toCharArray();
        char[] b = scanner.nextLine().toCharArray();

        for (int i = a.length - 1; i >= 0; i--) {
            char t = a[i];
            if (a[i] == '0') {
                a[i] = '1';
            } else {
                a[i] = '0';
            }

            int x = calsRes(a, 2);
            for (int j = b.length - 1; j >= 0; j--) {
                char z = b[j];
                for (int k = 0; k < 3; k++) {
                    if (b[j]-'0'!=k){
                        b[j] = (char) (k+'0');
                        if (calsRes(b, 3)==x){
                            System.out.println(x);
                            return;
                        }
                        b[j] = z;
                    }
                }
            }
            a[i] = t;
        }
    }

    private static int calsRes(char[] a, int p) {
        int res = 0;
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            int t = a[i] - '0';
            res += t * Math.pow(p,j);
        }
        return res;
    }
}

public class One {

}
