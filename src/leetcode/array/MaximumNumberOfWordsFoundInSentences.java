/*
https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
 */
package leetcode.array;

public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        for (int i = 0; i < sentences.length; i++) {
            max = Math.max(max,sentences[i].split(" ").length);
        }
        return max;
    }
    public static void main(String[] args) {
        int ans = mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
        System.out.println(ans);
    }
}
