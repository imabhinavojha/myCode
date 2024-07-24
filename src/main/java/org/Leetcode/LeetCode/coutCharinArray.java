package org.Leetcode.LeetCode;

public class coutCharinArray {
    public static void main(String[] args) {
        coutCharinArray obj = new coutCharinArray();
        char[] ch = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        obj.compress(ch);
        
    }
    public int compress(char[] chars) {
        int index = 0; // Index to track the position where the compressed characters are stored
        int i = 0; // Index to iterate through the original array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0; // Count the consecutive occurrences of currentChar

            // Count consecutive occurrences of currentChar
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Store the compressed character
            chars[index++] = currentChar;

            // If count is greater than 1, store its frequency as characters
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // Return the new length of the compressed array
        
    }
    
}
