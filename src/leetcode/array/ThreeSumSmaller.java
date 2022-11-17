package leetcode.array;

import java.util.Arrays;

public class ThreeSumSmaller {

    public static int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;
            while (leftPointer < rightPointer) {

                if (nums[i] + nums[leftPointer] + nums[rightPointer] > target) {
                    rightPointer--;
                }
                else if ((nums[i] + nums[leftPointer] + nums[rightPointer]) < target) {
                    count++;
                    int end = rightPointer-1;
                    while(leftPointer < end){
                        if(nums[i] + nums[leftPointer] + nums[end] < target){
                            count++;
                            end--;
                        }
                    }
                    leftPointer++;
                }
                else if (nums[i] + nums[leftPointer] + nums[rightPointer] == target) {
                    leftPointer++;
                    rightPointer--;
                }
            }
        }
        System.out.println("----------------");
        return count;
    }
    public static void main(String args[]) {

        System.out.println(threeSumSmaller(new int[]{-2, 0, 1, 3}, 2));
    }
}
