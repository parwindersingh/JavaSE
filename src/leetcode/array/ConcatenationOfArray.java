//https://leetcode.com/problems/concatenation-of-array/
package leetcode.array;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len*2];
        for(int i=0; i<ans.length; i++){
            ans[i] = nums[i%len];
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans[] = getConcatenation(new int[]{1,3,2,1});
        Arrays.stream(ans).forEach(System.out::println);
    }
}
