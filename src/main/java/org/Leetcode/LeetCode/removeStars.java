package org.Leetcode.LeetCode;

public class removeStars {
    public static void main(String[] args) {
        removeStars obj = new removeStars();
        String s = "leet**cod*e";
        String value = obj.removeStars(s);
        System.out.println(value);

    }

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            
            if (currentChar == '*') {
                // Find the index of the closest non-star character to the left
                int j = i - 1;
                while (j >= 0 && sb.charAt(j) == '*') {
                    j--;
                }
                
                // Remove the closest non-star character and the star itself
                if (j >= 0) {
                    sb.deleteCharAt(j);
                    i--; // Adjust the index after deleting the character
                }
                sb.deleteCharAt(i); // Remove the star itself
                i--; // Adjust the index after deleting the star
            }
        }
        
        return sb.toString();
       }
}