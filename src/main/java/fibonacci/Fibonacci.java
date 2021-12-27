package fibonacci;

/**
 * @author 王祥飞
 * @time 2021/12/24 4:06 PM
 */
class Solution {
    public int Fibonacci(int n) {
        if (n==0){
            return 0;
        }
        int a =0,b=1;

        for (int i = 2; i <=n ; i++) {
            int t = a;
            a = b;
            b= t+b;
        }
        return b;
    }
}


public class Fibonacci {

    public static void main(String[] args) {

    }
}
