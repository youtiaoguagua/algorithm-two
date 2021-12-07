package searchArray;

import java.util.Arrays;

/**
 * @author 王祥飞
 * @time 2021/12/7 5:06 PM
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
class Solution {

    public boolean searchArray2(int[][] array, int target) {
        if (array.length==0 || array[0].length==0) return false;
        int i = 0, j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (array[i][j] == target) return true;
            if (array[i][j] > target) j -- ;
            else i ++ ;
        }
        return false;
    }

    public boolean searchArray(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            int[] ints = array[i];
            if (ints.length==0){
                return false;
            }
            if (array[i][ints.length - 1] < target) {
                continue;
            }
            int a = 0;
            int b = ints.length - 1;
            while (a!=b){
                int m = a+b+1>>1;
                if (ints[m]>target){
                    b = m-1;
                }else {
                    a = m;
                }
            }
            if (ints[a]==target){
                return true;
            }

        }
        return false;
    }
}

public class SearchArray {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 14}};

        Solution solution = new Solution();
        boolean b = solution.searchArray2(a, 11);
        System.out.println(b);
    }

}
