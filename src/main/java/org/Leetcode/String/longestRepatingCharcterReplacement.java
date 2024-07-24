package org.Leetcode.String;

public class longestRepatingCharcterReplacement {
    public static void main(String[] args) {
        longestRepatingCharcterReplacement obj = new longestRepatingCharcterReplacement();
        String s = "ABAB";
        int  k = 2;
        obj.characterReplacement(s, k);

    }
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // Count array to keep track of character frequencies
        int maxLength = 0; // Maximum length of the substring with the same characters
        int maxCount = 0; // Maximum frequency of any character in the current window
        int left = 0; // Left pointer of the window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++; // Update frequency of the current character
            maxCount = Math.max(maxCount, count[currentChar - 'A']); // Update maxCount

            // If the number of replacements needed is greater than k,
            // move the left pointer to shrink the window
            if (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--; // Decrease frequency of the character at left pointer
                left++; // Move left pointer to the right
            }

            maxLength = Math.max(maxLength, right - left + 1); // Update maxLength
        }

        return maxLength;
        
    }
}
