//Leetcode: https://leetcode.com/problems/3sum/

package leetcode.array;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;
            while(leftPointer < rightPointer){
                if(nums[i] + nums[leftPointer] + nums[rightPointer] > 0){
                    rightPointer--;
                }
                else if(nums[i] + nums[leftPointer] + nums[rightPointer] < 0){
                    leftPointer++;
                }
                else if(nums[i] + nums[leftPointer] + nums[rightPointer] == 0){
                    ArrayList<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[i]);
                    tempList.add(nums[leftPointer]);
                    tempList.add(nums[rightPointer]);

                    set.add(tempList);

                    leftPointer++;
                    rightPointer--;
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);

        return list;
    }

    public static void main(String args[]){
        List<List<Integer>> result = threeSum(new int[]{-1,0,1,2,-1,-4});
        for(List ls : result){
            System.out.println(ls);
        }
    }
}
