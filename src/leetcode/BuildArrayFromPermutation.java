//leetcode: https://leetcode.com/problems/build-array-from-permutation/
package leetcode;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            nums[i] = nums[i] + (len * (nums[nums[i]]%len));
        }
        for(int i=0; i<len; i++){
            nums[i] = nums[i]/len;
        }
        return nums;
    }

    public static void main(String[] args) {
        Arrays.stream(buildArray(new int[]{0, 2, 1, 5, 3, 4}))
                .forEach(System.out::println);
    }
}
