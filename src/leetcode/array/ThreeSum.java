//Leetcode: https://leetcode.com/problems/3sum/

package leetcode.array;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Map<String, Boolean> map = new HashMap<>();
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
                    map.put(( nums[i] + "," + nums[leftPointer] + "," + nums[rightPointer]), true);
                    leftPointer++;
                    rightPointer--;
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] arr = key.split(",");
            List<Integer> tempList = new ArrayList<>();
            for(String val : arr){
                tempList.add(Integer.parseInt(val));
            }
            list.add(tempList);
        }
        return list;
    }

    public static void main(String args[]){
        List<List<Integer>> result = threeSum(new int[]{-1,0,1,2,-1,-4});
        for(List ls : result){
            ls.forEach(s -> System.out.print(s.toString()+" "));
            System.out.println();
        }
    }
}
