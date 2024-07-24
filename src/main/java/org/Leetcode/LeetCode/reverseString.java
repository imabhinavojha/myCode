package org.Leetcode.LeetCode;

public class reverseString {
    public static void main(String[] args) {
        char[] input = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println("Original: " + new String(input));

        reverseString(input);

        System.out.println("Reversed: " + new String(input));

    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
}
