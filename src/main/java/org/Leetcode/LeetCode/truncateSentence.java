package org.Leetcode.LeetCode;

public class truncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        truncateSentence obj = new truncateSentence();
        obj.truncateSentence(s, k);

    }

    public String truncateSentence(String s, int k) {
        String [] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(arr[i]);
            if (i < k - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
    
}
