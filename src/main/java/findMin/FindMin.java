package findMin;

/**
 * @author 王祥飞
 * @time 2021/12/24 4:12 PM
 */
class Solution {
    public int findMin(int[] nums) {
        if (nums.length==0){
            return -1;
        }
        if (nums.length==1||nums[0]<nums[nums.length-1]){
            return nums[0];
        }

        for (int i = nums.length-1; i >=0; i--) {
            if (nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}

public class FindMin {
    public static void main(String[] args) {

    }
}
