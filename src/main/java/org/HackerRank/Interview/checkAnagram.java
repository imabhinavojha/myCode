package org.HackerRank.Interview;
import java.util.Arrays;

public class checkAnagram {
    public static void main(String[] args) {

        String str1 = "LiSten".replaceAll("\\s", "").toLowerCase();
        String str2 = "SilE1nt".replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("not a anagram");
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean value = Arrays.equals(charArray1, charArray2);
        System.out.println(value);
    }
}
