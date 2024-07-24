package org.Leetcode.LeetCode;

public class reverselist {
    public static void main(String[] args) {
        reverselist obj = new reverselist();

    }

    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        // If needle is empty, return 0
        if (needleLength == 0) return 0;
        
        // Iterate through the haystack string
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if substring starting at index i matches the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Return the index of the first occurrence
            }
        }
        
        return -1; // Needle not found in haystack
    }
    
}
