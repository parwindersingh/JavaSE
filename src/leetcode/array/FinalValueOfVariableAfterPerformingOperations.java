//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
/*
Input: operations = ["--X","X++","X++"]
Output: 1
 */
package leetcode.array;

public class FinalValueOfVariableAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0; i<operations.length; i++){
            x = operations[i].charAt(1)=='+' ? ++x : --x;
        }
        return x;
    }
    public static void main(String[] args) {
        int ans = finalValueAfterOperations(new String[]{"--X","X++","X++"});
        System.out.println(ans);
    }
}
