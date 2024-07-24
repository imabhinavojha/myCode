package org.Leetcode.String;

public class mergeString {
    
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "pq";
        mergeString obj = new mergeString();
        obj.mergeAlternately(str1, str2);
        
    }

    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        int shorter = Math.min(n1, n2);
        StringBuilder sb = new StringBuilder(n1 + n2);

        // Iterate over the shorter string, appending characters in alternating order
        for (int i = 0; i < shorter; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        // If one string is longer, append its remaining characters at the end
        if (n1 > n2) {
            sb.append(word1.substring(shorter));
        } else if (n2 > n1) {
            sb.append(word2.substring(shorter));
        }

        return sb.toString();
        
    }
}
