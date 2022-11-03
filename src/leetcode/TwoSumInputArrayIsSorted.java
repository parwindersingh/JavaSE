//Leetcode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumInputArrayIsSorted {

    public static int[] twoSumInputArrayIsSorted(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int difference = target - numbers[i];
            if(map.containsKey(difference))
                return new int[]{map.get(difference)+1, (i+1)};
            map.put(numbers[i], i);
        }
        return null;
        /*
            int leftPointer = 0;
            int rightPointer = numbers.length - 1;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[leftPointer] + numbers[rightPointer] > target) {
                    rightPointer--;
                } else if (numbers[leftPointer] + numbers[rightPointer] < target) {
                    leftPointer++;
                } else if (numbers[leftPointer] + numbers[rightPointer] == target) {
                    return new int[]{leftPointer + 1, rightPointer + 1};
                }
            }
            return null;
         */
    }
    public static void main(String args[]){
        int result[] = twoSumInputArrayIsSorted(new int[]{3,2,3},6);
        for(int i=0 ;i<result.length; i++){
            System.out.println(result[i]+" ");
        }
    }
}

