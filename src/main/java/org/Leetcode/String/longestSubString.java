package org.Leetcode.String;

import java.util.HashSet;

public class longestSubString {
    public static void main(String[] args) {
        longestSubString obj = new longestSubString();
        String s =  "abcabcbb";
        obj.lengthOfLongestSubstring(s);
    }
    
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(maxLength);

        return maxLength;
        
    }

}
