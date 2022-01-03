package movingCount;

/**
 * @Author youtiaoguagua
 * @create 2022/1/4 0:41
 */
class Solution {

    private int[][] ints;
    private int threshold;
    private int count = 0;


    public int movingCount(int threshold, int rows, int cols) {
        ints = new int[rows][cols];
        this.threshold = threshold;
        dfs(0,0);
        return count;
    }

    private void dfs(int x, int y) {
        if (x<0||x>ints.length-1||y<0||y>ints[0].length-1||ints[x][y]!=0||calSum(x)+calSum(y)>threshold){
            return;
        }
        count++;
        ints[x][y] = -1;
        int[] a = {0,0,1,-1},b={1,-1,0,0};
        for (int i = 0; i < 4; i++) {
            int m = x+a[i],n=y+b[i];
            dfs(m,n);
        }

    }

    private int calSum(int i) {
        int res = 0;
        while (i!=0){
            res+=i%10;
            i/=10;
        }
        return res;

    }
}


public class MovingCount {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.movingCount(18, 40, 40));
    }
}



