package org.Leetcode.LeetCode;

public class gcdString {
    public static void main(String[] args) {
        String str1 = "abcabc";
        String str2 = "abc";
        gcdString obj = new gcdString();
        obj.gcdOfStrings(str1, str2);

    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Iterate over possible lengths of the divisor string
        for (int i = Math.min(len1, len2); i > 0; i--) {
            // Check if the current substring of length i divides both str1 and str2
            if (len1 % i == 0 && len2 % i == 0) {
                String divisor = str1.substring(0, i);
                if (isDivisor(divisor, str1) && isDivisor(divisor, str2)) {
                    return divisor;
                }
            }
        }

        return "";
    }

    // Helper function to check if a string is a divisor of another string
    private boolean isDivisor(String divisor, String str) {
        int len = str.length();
        int divisorLen = divisor.length();

        // Check if str is divisible by divisor
        for (int i = 0; i < len; i += divisorLen) {
            if (!str.substring(i, Math.min(i + divisorLen, len)).equals(divisor)) {
                return false;
            }
        }

        return true;

    }
}