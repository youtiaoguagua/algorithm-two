package replaceSpaces;

/**
 * @author 王祥飞
 * @time 2021/12/7 5:42 PM
 */

class Solution {
    public String replaceSpaces(StringBuffer str) {
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                a.append("%20");
            }else {
                a.append(str.charAt(i));
            }
        }
        return a.toString();
    }
}

public class ReplaceSpaces {
    public static void main(String[] args) {
        Solution solution = new Solution();
        StringBuffer stringBuffer = new StringBuffer("We are happy.");
        String s = solution.replaceSpaces(stringBuffer);
        System.out.println(s);

    }
}
