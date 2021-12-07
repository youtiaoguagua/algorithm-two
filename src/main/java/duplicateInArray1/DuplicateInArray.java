package duplicateInArray1;

/**
 * @author 王祥飞
 * @time 2021/12/7 4:29 PM
 * 给定一个长度为 n 的整数数组 nums，数组中所有的数字都在 0∼n−1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 * 注意：如果某些数字不在 0∼n−1 的范围内，或数组中不包含重复数字，则返回 -1；
 */
class Solution {

    public int duplicateInArray(int[] nums) {
        for (int num : nums) {
            if (num >= nums.length || num < 0) {
                return -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != i) {
                int a = nums[i];
                int b = nums[a];
                if (nums[i] == b) {
                    return b;
                }
                nums[i] = b;
                nums[a] = a;
            }
        }
        return -1;
    }
}

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 4, 3, 2, 6, 7};
        Solution solution = new Solution();
        solution.duplicateInArray(a);
    }
}
