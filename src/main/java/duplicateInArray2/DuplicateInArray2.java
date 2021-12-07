package duplicateInArray2;

import java.util.Arrays;

/**
 * @author 王祥飞
 * @time 2021/12/7 4:55 PM
 */
class Solution {
    public int duplicateInArray(int[] nums) {
        for (int num : nums) {
            if (num>=nums.length||num<0){
                return -1;
            }
        }

        int[] a = new int[nums.length];
        Arrays.fill(a,-1);
        for (int i = 0; i < nums.length; i++) {
            int b = nums[i];
            if (a[b]==nums[i]){
                return nums[i];
            }else {
                a[b] = nums[i];
            }
        }
        return -1;
    }
}

public class DuplicateInArray2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {2, 3, 5, 4, 3, 2, 6, 7};
        System.out.println(solution.duplicateInArray(ints));
    }
}
