/*
https://leetcode.com/problems/decompress-run-length-encoded-list/
Input: nums = [1,2,3,4]
Output: [2,4,4,4]
 */
package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        int resultArraySize = 0;
        for(int i=0; i<nums.length; i+=2){
            resultArraySize += nums[i];
        }
        int result[] = new int[resultArraySize];
        int startIndex=0;
        for(int i=0; i<nums.length; i+=2){
            Arrays.fill(result,startIndex, startIndex+nums[i], nums[i+1]);
            startIndex+=nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Arrays.stream(decompressRLElist(new int[]{1,2,3,4}))
                .forEach(System.out::println);
    }
}
