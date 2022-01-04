package power;

/**
 * @author 王祥飞
 * @time 2022/1/4 1:02 PM
 */
class Solution {


    public double Power(double base, int exponent) {
        long t = exponent;
        if (t == 0) {
            return 1;
        }
        boolean zheng;
        zheng = t >= 0;
        t = zheng ? t : t * -1;
        double dfs = dfs(base, t, base);
        return zheng ? dfs : 1 / dfs;
    }

    private double dfs(double base, long exponent, double t) {
        if (exponent == 1) {
            return base;
        }
        boolean is = false;
        if (exponent % 2 == 1) {
            exponent -= 1;
            is = true;
        }
        exponent /= 2;
        double res = base * base;
        if (is) {
            return base * dfs(res, exponent, base);
        } else {
            return dfs(res, exponent, base);
        }
    }
}

class Solution2 {


    public double Power(double base, int exponent) {
        long t = exponent;
        if (t == 0) {
            return 1;
        }
        boolean zheng;
        zheng = t >= 0;
        t = zheng ? t : t * -1;
        double dfs = dfs(base, t);
        return zheng ? dfs : 1 / dfs;
    }

    private double dfs(double base, long exponent) {

        if (exponent == 1) {
            return base;
        }

        double t = base;
        base *= base;
        if (exponent % 2 == 0) {
            return dfs(base, exponent / 2);
        }
        return t * dfs(base, (exponent - 1) / 2);
    }

}


public class Power {

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.Power(2, 11));
    }
}
