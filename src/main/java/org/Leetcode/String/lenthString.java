package org.Leetcode.String;

public class lenthString {
    public static void main(String[] args) {
        lenthString obj = new lenthString();
        String str = "Hello World";
        obj.lengthOfLastWord(str);
        
    }

    public static int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();
        
        // Initialize a variable to store the length of the last word
        int length = 0;
        
        // Iterate over the characters of the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            // If a non-space character is encountered, increment the length
            // If a space character is encountered and length is non-zero, break the loop
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }
        
        // Return the length of the last word
        return length;
    }
    
}
