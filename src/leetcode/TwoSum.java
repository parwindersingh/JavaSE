//Leetcode: https://leetcode.com/problems/two-sum/
package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            if( map.containsKey(difference) ) {
                return new int[] { map.get(difference) , i };
            }
            map.put( nums[i], i );
        }
        return null;
    }
    public static void main(String args[]){
        int result[] = twoSum(new int[]{3,2,3},6);
        for(int i=0 ;i<result.length; i++){
            System.out.println(result[i]+" ");
        }
    }
}
