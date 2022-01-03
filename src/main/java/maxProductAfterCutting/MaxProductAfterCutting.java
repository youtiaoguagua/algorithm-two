package maxProductAfterCutting;

/**
 * @Author youtiaoguagua
 * @create 2022/1/4 1:12
 */
class Solution {
    public int maxProductAfterCutting(int length) {
        int t = 1;
        if (length<=2){
            return 1;
        }
        if (length==3){
            return 2;
        }
        while (length%3==1||length%3==2){
            length-=2;
            t*=2;
        }

        while (length>0){
            length-=3;
            t*=3;
        }
        return t;
    }
}

public class MaxProductAfterCutting {

    public static void main(String[] args) {

    }
}
