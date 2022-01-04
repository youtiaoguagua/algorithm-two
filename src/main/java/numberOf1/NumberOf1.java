package numberOf1;

/**
 * @author 王祥飞
 * @time 2022/1/4 12:46 PM
 */
class Solution {
    public int NumberOf1(int n) {
        int t = 0;

        for (int i = 0; i < 32; i++) {
            if ((n&1)==1){
                t++;
            }
            n=n>>1;
        }
        return t;
    }
}

public class NumberOf1 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.NumberOf1(-2));

    }
}
