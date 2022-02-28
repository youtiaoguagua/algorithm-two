package offer;

/**
 * @author 王祥飞
 * @time 2022/1/12 3:56 PM
 */
public class IsMatch {

    private String s;
    private String p;
    private boolean[][] dp;

    public boolean isMatch(String s, String p) {
        this.s = s;
        this.p = p;
        dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        int l = 0;
        while (l < p.length() && p.charAt(l) == '*') {
            l++;
        }
        p = p.substring(l);

        s = " " + s;
        p = " " + p;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < p.length(); j++) {
                if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                    continue;
                }

                if (p.charAt(j) == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i) == p.charAt(j - 1) || s.charAt(j - 1) == '.'));
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                }
            }

        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
        IsMatch isMatch = new IsMatch();
        System.out.println(isMatch.isMatch("aa", "a*"));
    }
}
