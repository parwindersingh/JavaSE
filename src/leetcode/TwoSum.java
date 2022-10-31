package leetcode;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        boolean flag = true;
        for(int i=0; i<nums.length && flag; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    flag = false;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int result[] = twoSum(new int[]{3,2,3},6);
        for(int i=0 ;i<result.length; i++){
            System.out.println(result[i]+" ");
        }
    }
}
